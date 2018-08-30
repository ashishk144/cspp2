
import java.util.Scanner;
/**.
 * Class for solution.
 */
public class Solution {
    /**.
     * Solution Constructor
     */
    private Solution() {

    }
    /**.
     * { Main Function }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scanobj = new Scanner(System.in);
        String inputstr = scanobj.nextLine();
        String reverse = reverseString(inputstr);   
        System.out.println(reverse);
    }
    /**.
     * Function to reverse string
     *
     * @param      str   The string
     *
     * @return     { description_of_the_return_value }
     */
    static String reverseString(final String str) {
        int l = str.length() - 1;
        String revstr = "";
        for (; l > -1 ; l--) {
            revstr += str.charAt(l);
        }
        return revstr;
    }
}
