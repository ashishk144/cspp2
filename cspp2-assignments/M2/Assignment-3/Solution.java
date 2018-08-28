import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * Making solution private.
         */
    }
    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
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
        if (e == 0) {
            return 1;
        } else {
            return b * power(b, e - 1);
        }
    }
}
