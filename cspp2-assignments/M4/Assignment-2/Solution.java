import java.util.Scanner;
// import java.util.Arrays;
/**
 * Class for solution.
 */
final class Solution {
    /**.
     * Default constructor
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
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int m1 = sc.nextInt(), n1 = sc.nextInt();
        int[][] b = new int[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        if (m1 != m || n1 != n) {
            System.out.println("not possible");
        } else {
            int[][] c = new int[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        int i = 0, j = 0;
        for (i = 0; i < m1; i++) {
            for (j = 0; j < n1 - 1; j++) {
                System.out.print(c[i][j] + " ");
            }
        System.out.print(c[i][j]);
        System.out.println();
        }
        }
    }
}
