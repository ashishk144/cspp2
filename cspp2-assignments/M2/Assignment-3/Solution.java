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
    /**.
     * { main function }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /**.
     * { Power Function }
     *
     * @param      b     { base }
     * @param      e     { exponent }
     *
     * @return     { description_of_the_return_value }
     */
    static long power(final int b, final int e) {
        if (e == 0) {
            return 1;
        } else {
            return b * power(b, e - 1);
        }
    }
}
