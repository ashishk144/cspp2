import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Solution
     *
     * @param      args  The arguments
     */
    private Solution() {
        /**
         * { item_description }
         */
    }
    public static void main(String[] args) {
        /**
         * Main Function
         */
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /*
    Need to write the power function and print the output.
    */
    static long power(final int b, final int e) {
        /**
         * Power function
         */
        if (e == 0) {
            return 1;
        } else {
            return b * power(b, e - 1);
        }
    }
}
