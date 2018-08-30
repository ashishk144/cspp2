import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
final class Solution {
	/**
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
		int m_1 = sc.nextInt(), n_1 = sc.nextInt();
		int[][] b = new int[m_1][n_1];
		for (int i = 0; i < m_1; i++) {
			for (int j = 0; j < n_1; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		if (m_1 != m || n_1 != n) {
			System.out.println("not possible");
		} else {
			int[][] c = new int[m_1][n_1];
		for (int i = 0; i < m_1; i++) {
			for (int j = 0; j < n_1; j++) {
				c[i][j] = a[i][j] + b[i][j];
            }
		}
        int i = 0, j=0;
        for (; i < m_1; i++) {
            for (; j < n_1-1; j++) {
                System.out.print(c[i][j] + " ");
            }
        System.out.print(c[i][j]);
        System.out.println();
        }
        }
	}
}
