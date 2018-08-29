
import java.util.Scanner;
/*
    Do not modify this main function.
    */
    /**
     * Class for solution.
     */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
/* Fill the main function to print the number of 7's between 1 to n*/
/**.
 * Main function
 *
 * @param      args  The arguments
 */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int temp = 0;
        int j;
        final int seven = 7;
        final int ten = 10;
        for (int i = 1; i <= n; i++) {
            j = i;
            while (j > 0) {
                // System.out.println(j);
                temp = j % ten;
                // System.out.println(temp);
            if (temp == seven) {
                count += 1;
            }
            j = j / ten;
            }
        }
        System.out.println(count);
    }
}
