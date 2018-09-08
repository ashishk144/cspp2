import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : Ashish
 */
class Set {
    /**.
     * array
     */
    private int[] arr;
    /**.
     * size
     */
    private int size;
    /**.
     * Constructs the object.
     */
    public Set() {
        arr = new int[10];
        size = 0;
    }
    /**.
     * function  to return size
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size;
    }
    /**.
     * Adds an item
     *
     * @param      item  The item
     */
    public void add(int item) {
        if (size == arr.length) {
            resize();
        }
        arr[size++] = item;
    }
    /**.
     * Resizes array
     */
    private void resize() {
        arr = Arrays.copyOf(arr, 2 * arr.length);
    }
    /**.
     * Adds all vals in array
     *
     * @param      newarr  The newarr
     */
    public void add(int[] newarr) {
        for (int eachVal: newarr) {
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] == eachVal) {
                    count += 1;
                }
            }
            if (count == 0) {
                add(eachVal);
            }
        }
    }
    /**.
     * Function to check whether the entered val exists in array or not
     *
     * @param      val   The value
     *
     * @return     { description_of_the_return_value }
     */
    public boolean contains(int val) {
        for (int eachVal: arr) {
            if (eachVal == val) {
                return true;
            }
        }
    return false;
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (size > 0) {
            String str = "{";
            for (int i = 0; i < size - 1; i++) {
                str += arr[i] + ", ";
            } str += arr[size - 1] + "}";
            return str;
        } else {
            return "{}";
        }
    }
    /**.
     * gets the value at index
     *
     * @param      index  The index
     *
     * @return     { description_of_the_return_value }
     */
    public int get(int index) {
        if (index >=0 && index < size) {
            return arr[index];
        }
        return -1;
    }
    /**.
     * Searches for the first match.
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public int indexOf(int item) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
    /**.
     * Finds the intersection among the set
     *
     * @param      that  The that
     *
     * @return     Intersected set.
     */
    public Set intersection(Set that) {
        Set newset = new Set();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < that.size(); j++) {
                int element = that.get(i);
                if (arr[i] == element) {
                    newset.add(arr[i]);
                    break;
                }
            }
        }
        return newset;
    }
    public Set retainAll(int[] array) {
        Set set = new Set();
        return set;
    }
    public int[][] cartesianProduct(Set inpset) {
        if (size > 0) {
            int[][] newarray = new int[2][2];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < (inpset.size() - 1); j++) {
                    newarray[j][0] = arr[i];
                    newarray[0][j] = inpset.get(j);
                }
            }
            return newarray;
        } else {
            return null;
        }
    }
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
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
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
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
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}
