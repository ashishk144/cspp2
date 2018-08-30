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
				System.out.println(a[i][j]);
			}
		}

	}
}