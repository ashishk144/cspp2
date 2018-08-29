
import java.util.Scanner;
/*
    Do not modify this main function.
    */
    /**
     * Class for solution.
     */
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
/**
 * Main function
 *
 * @param      args  The arguments
 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);      
        int n = s.nextInt();
        int count = 0;
        int temp = 0;
        int j;
        for(int i = 1; i <= n; i++) {
            j = i;
            while (j > 0) {
                temp = j % 7;
            if (temp == 7 || temp == 0) {
                count += 1;
            }
            j = j / 7;
            }
        }
        System.out.println(count);
    }
}