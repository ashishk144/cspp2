import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**.
 * Class of List
 */
class List {
    /**.
     * { var_description }
     */
    private int[] list;
    /**.
     * { var_description }
     */
    private int size;
    /**.
     * Constructs the object.
     */
    public List() {
        final int ten = 10;
        list = new int[ten];
        size = 0;
    }
    /**.
     * { function_description }
     *
     * @param      item  The item
     */
    public void add(final int item) {
        if (size == list.length) {
            resize();
        }
        list[size++] = item;
        // size++;
    }
    /**.
     * { function_description }
     */
    private void resize() {
        list = Arrays.copyOf(list, list.length * 2);
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size;
    }
    /**.
     * { function_description }
     *
     * @param      index  The index
     */
    public void remove(final int index) throws Exception {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                list[i] = list[i + 1];
            }
            size--;
        } else {
            throw new Exception("Invalid Position Exception");
        }
    }
    /**.
     * { function_description }
     *
     * @param      index  The index
     *
     * @return     { description_of_the_return_value }
     */
    public int get(final int index) {
        if (index >= 0 && index < size) {
            return list[index];
        }
        return -1;
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (size > 0) {
        String display = "[";
        for (int i = 0; i < size - 1; i++) {
            display += list[i] + ",";
        } display += list[size - 1] + "]";
        return display;
        }
        return "[]";
    }
    /**.
     * { function_description }
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public boolean contains(final int item) {
        return indexOf(item) != -1;
    }
    /**.
     * Searches for the first match.
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public int indexOf(final int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return i;
            }
        }
        return -1;
    }
    /*
    Inserts all the elements of specified int array to the end of list
    */
    /**.
     * Adds all.
     *
     * @param      newArray  The new array
     */
    public void addAll(final int[] newArray) {
        for (int eachVal: newArray) {
            add(eachVal);
        }
    }
     /**.
      * Removes all.
      *
      * @param      newArray  The new array
      */
     public void removeAll(final int[] newArray) throws Exception{
        for (int eachV: newArray) {
            int i = indexOf(eachV);
            while (i != -1) {
                if (i >= 0) {
                    // System.out.println(list[i]);
                    remove(i);
                    i = indexOf(eachV);
                }
            }
        }
    }
    /**.
     * sublist function
     *
     * @param      start  The start
     * @param      end    The end
     *
     * @return     { description_of_the_return_value }
     */
    public List subList(final int start, final int end) {
        if (size > 0 && start >= 0 && end <= size && start < end) {
            List l = new List();
            for (int i = start; i < end; i++) {
                l.add(list[i]);
            }
        return l;
        } else {
            System.out.println("Index Out of Bounds Exception");
            return null;
        }
    }
    /**.
     * Equals function
     *
     * @param      inpList  The inp list
     *
     * @return     { description_of_the_return_value }
     */
    public boolean equals(final List inpList) {
        if (inpList.size() != size) {
            return false;
        } else {
            for (int i = 0; i < size; i++) {
                if (inpList.get(i) != list[i]) {
                    return false;
                }
            }
        }
        return true;
    }
    /**.
     * Clear function
     */
    public void clear() {
        size = 0;
    }

    public int count(int item) {
        int count = 0;
        for (int eachElement: list) {
            if (eachElement == item) {
                count++;
            }
        }
    return count;
    }
}
class Solution {
    /**.
     * Main function
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) throws Exception{
        // create an object of the list to invoke methods on it
        List l = new List();

        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "add":
                    if (tokens.length == 2) {
                        String[] t = tokens[1].split(",");
                        if (t.length == 1) {
                            l.add(Integer.parseInt(tokens[1]));
                        }
                    }
                break;
                case "size":
                    System.out.println(l.size());
                break;
                case "print":
                    System.out.println(l);
                break;
                case "remove":
                    if (tokens.length == 2) {
                        try {
                        l.remove(Integer.parseInt(tokens[1]));
                        } catch(Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                break;
                case "indexOf":
                    if (tokens.length == 2) {
                        System.out.println(l.indexOf(
                            Integer.parseInt(tokens[1])));
                    }
                break;
                case "get":
                    if (tokens.length == 2) {
                        System.out.println(l.get(
                            Integer.parseInt(tokens[1])));
                    }
                break;
                case "contains":
                    if (tokens.length == 2) {
                        System.out.println(l.contains(
                            Integer.parseInt(tokens[1])));
                    }
                break;
                case "addAll":
                    if (tokens.length == 2) {
                        String[] t1 = tokens[1].split(",");
                        int[] temp = new int[t1.length];
                        for (int i = 0; i < temp.length; i++) {
                            temp[i] = Integer.parseInt(t1[i]);
                        }
                        l.addAll(temp);
                    }
                break;
                case "removeAll":
                    if (tokens.length == 2) {
                        String[] t2 = tokens[1].split(",");
                        int[] a = new int[t2.length];
                        for (int i = 0; i < t2.length; i++) {
                            a[i] = Integer.parseInt(t2[i]);
                        }
                        l.removeAll(a);
                    }
                break;
                case "subList":
                    if (tokens.length != 2) {
                        break;
                    }
                    String[] arrstring3 = tokens[1].split(",");
                    List object = l.subList(Integer.parseInt(arrstring3[0]),
                            Integer.parseInt(arrstring3[1]));
                    if (object != null) {
                        System.out.println(object);
                    }
                    break;
                case "equals":
                    if (tokens.length == 2) {
                        String[] lt = tokens[1].split(",");
                        List l2 = new List();
                        for (int k = 0; k < lt.length; k++) {
                            l2.add(Integer.parseInt(lt[k]));
                        }
                        System.out.println(l.equals(l2));
                    }
                break;
                case "clear":
                    l.clear();
                break;
                case "count":
                    l.count(Integer.parseInt(tokens[1]));
                break;
                default:
                break;
            }
        }
    }
}
