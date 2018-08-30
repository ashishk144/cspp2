
import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**.
     * Default Constructor
     */
    private Solution() {

    }
    /**.
     * Main function
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max;
        if (n < 1) {
            System.out.println("Array size cannot be less than 1");
        } else {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            max = a[0];
            for (int i = 0; i < n; i++) {
                if (max < a[i]) {
                    max = a[i];
                }
            }
            System.out.println(max);
        }
    }
}

