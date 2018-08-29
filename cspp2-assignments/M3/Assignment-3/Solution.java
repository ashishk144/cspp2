
import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /** First.
     * Main function to call gcd
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        // gcd(n1,n2);
        System.out.println(gcd(n1, n2));
    }
    /**.
     * GCD function
     *
     * @param      n1    The n 1
     * @param      n2    The n 2
     *
     * @return     { returning the GCD }
     */
    static int gcd(final int n1, final int n2) {
        int n;
        if (n1 > n2) {
            n = n1;
        } else {
            n = n2;
        }
        for (int i = n; i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
    return 0;
    }
}


