import java.util.Scanner;
import java.util.Arrays;
/**.
 * Class for sorted set.
 */
class SortedSet extends Set {
    /**.
     * Sort function
     */
    public void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (set[i] < set[j]) {
                    int temp = set[j];
                    set[j] = set[i];
                    set[i] = temp;
                }
            }
        }
    }
    /**.
     * Gets the index.
     *
     * @param      element  The element
     *
     * @return     The index.
     */
    public int getIndex(final int element) {
        // sort();
        if (size() >= 0) {
            for (int i = 0; i < size(); i++) {
                if (set[i] == element) {
                    return i;
                } else if (set[i] > element) {
                    return i;
                }
            }
        }
        return size();
    }
    /**.
     * Subset
     *
     * @param      fromElement  The from element
     * @param      toElement    To element
     *
     * @return     { description_of_the_return_value }
     */
    public Set subSet(final int fromElement, final int toElement) throws Exception{
        if (fromElement > toElement) {
            throw new Exception("Invalid Arguments to Subset Exception");
        } else {
            // sort();
            int fromindex = getIndex(fromElement);
            int toindex = getIndex(toElement);
            // System.out.println(fromindex + " " + toindex);
            Set res = new Set();
            for (int i = fromindex; i < toindex; i++) {
                // System.out.println(get(i));
                    res.add(get(i));
            }
            // System.out.println(res.toString());
            return res;
        }
    }
    /**.
     * Headset
     *
     * @param      toele  The toele
     *
     * @return     { description_of_the_return_value }
     */
    public Set headSet(final int toele) throws Exception {
        // sort();
        Set result = new Set();
        int toIndex = getIndex(toele);
        for (int i = 0; i < toIndex; i++) {
            // if (set[i] < toele) {
            result.add(set[i]);
            // }
        }
        if (result.size() == 0) {
            throw new Exception("Set Empty Exception");
        }
        return result;
    }
    /**.
     * Adds all.
     *
     * @param      newarray  The newarray
     */
    public void addAll(final int[] newarray) {
        add(newarray);
        sort();
    }
    /**.
     * Returns last value
     *
     * @return     { description_of_the_return_value }
     */
    public int last() throws Exception {
    if (size() == 0) {
        throw new Exception("Set Empty Exception");
    }
    return set[size() - 1];
    }
}
/**.
 * Class for solution.
 */
final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**.
     * Main function
     st     * @param      args       The arguments
     *
     * @throws     Exception  { exception_description }
     */
    public static void main(final String[] args) throws Exception {
        SortedSet s = new SortedSet();
        Scanner stdin = new Scanner(System.in);
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "print":
                System.out.println(s);
                break;
            case "add":
                s.add(Integer.parseInt(tokens[1]));
                break;
            case "addAll":
                String[] arg = tokens[1].split(",");
                int[] arr = new int[arg.length];
                for (int i = 0; i < arg.length; i++) {
                    arr[i] = Integer.parseInt(arg[i]);
                }
                s.addAll(arr);
                break;
            case "subSet":
                String[] ar = tokens[1].split(",");
                int[] a = new int[ar.length];
                for (int i = 0; i < ar.length; i++) {
                    a[i] = Integer.parseInt(ar[i]);
                }
                try {
                Set set = s.subSet(a[0], a[1]);
                if (set != null) {
                    System.out.println(set.toString());
                }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "headSet":
            try {
                System.out.println(s.headSet(Integer.parseInt(
                    tokens[1])).toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
                break;
            case "last":
            try {
                System.out.println(s.last());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            break;
            case "intersection":
                Set st = new Set();
                Set t = new Set();
                int [] intArray = intArray(tokens[1]);
                st.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(st.intersection(t));
                break;
            case "retainAll":
                st = new Set();
                intArray = intArray(tokens[1]);
                st.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(st.retainAll(intArray));
                break;
            default:
            break;
            }
        }
    }
}
