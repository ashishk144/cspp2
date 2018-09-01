import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author : Ashish
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
    // write your code here
        for (int number = 2; number <= n; number++) {
            if (number % 2 == 1) {
                int factorcount = 0;
                for (int compcheck = 2; compcheck <= number &&
                    factorcount < 2; compcheck++) {
                    if (number % compcheck == 0) {
                        factorcount += 1;
                    }
                }
            if (factorcount > 1) {
                System.out.println(number);
            }
            }
        }
    }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}
