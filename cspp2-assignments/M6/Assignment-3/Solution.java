import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a java program to replace each element
 *  of the given char array that matches the given
 *  character with the given replacement.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
     * Function to replace each element
     *  of the given char array that matches the given
     *  character with the given replacement.
     *
     * @param      charArray  The character array
     * @param      oldChar    The old character
     * @param      newChar    The new character
     *
     * @return     new character array with replaced characters
     */
    static char[] replaceAll(final char[] charArray,
        final char oldChar, final char newChar) {
    // write your code here
        for (int iter = 0; iter < charArray.length; iter++) {
            if (charArray[iter] == oldChar) {
                charArray[iter] = newChar;
                // System.out.println(charArray[i]);
            }
        }
        return charArray;
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] charArray = new char[n];
        for (int i = 0; i < n; i++) {
            charArray[i] = scan.next().charAt(0);
        }
        char oldChar = scan.next().charAt(0);
        char newChar = scan.next().charAt(0);
        char[] newCharArray = replaceAll(charArray, oldChar, newChar);
        System.out.println(Arrays.toString(newCharArray));
    }
}
