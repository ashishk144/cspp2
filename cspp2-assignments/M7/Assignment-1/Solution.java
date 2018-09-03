import java.util.Scanner;
/**.
 * Class for input validation.
 */
class InputValidator {
    private String inp;
    /**
     * Constructs the object.
     *
     * @param      startinp  The startinp
     */
    InputValidator(String startinp) {
        inp = startinp;
    }
    /**
     * function to find the length
     *
     * @return     { description_of_the_return_value }
     */
    public int length() {
        System.out.println("Len function");
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
        final int six = 6;
        if (inp.length() >= six) {
            return true;
        }
        return false;
    }
}
/**.
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * Main function
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        InputValidator inp = new InputValidator(input);
        System.out.println(inp.validateData());
        InputValidator test = new InputValidator("jksaj");
    }
}
