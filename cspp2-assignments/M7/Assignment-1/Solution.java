import java.util.Scanner;
/**.
 * Class for input validation.
 */
class InputValidator {
    String inp;
    /**
     * Constructs the object.
     *
     * @param      startinp  The startinp
     */
    public InputValidator(String startinp) {
        inp = startinp;
    }
    public int length() {
        int len = 0;
        for (char eachval:inp.toCharArray()) {
            len += 1;
        }
    return len;
    }
    /**
     * Validation method
     *
     * @return     { Boolean }
     */
    public boolean validateData() {
        if (inp.length() >= 5) {
            return true;
        } else {
            return false;
        }
    }
}
/**.
 * Class for solution.
 */
public class Solution {
    /**.
     * Main function
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        InputValidator inp = new InputValidator(input);
        System.out.println(inp.validateData());
    }
}
