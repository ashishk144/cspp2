import java.util.*;
/**
 * Class for input validation.
 */
class InputValidator {
    String inp;
    public InputValidator(String startinp) {
        String inp = startinp;
    }
    // public int length() {
    //     int len = 0;
    //     for (InputValidator eachval: inp) {
    //         len += 1;
    //     }
    // return len;
    // }
    public boolean validateData() {
        if (inp.length() >= 5) {
            return true;
        } else {
            return false;
        }
    }
}
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Main function
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}
