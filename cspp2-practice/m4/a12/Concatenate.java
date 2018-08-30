import java.util.Scanner;
/**
 * Class for concatenate.
 */
final class Concatenate {
    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        str1 = "Hello " + str + "!";
        System.out.println(str1);
    }
}