import java.util.Scanner;

public class Solution {
    /*
    Do not modify this main function.
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base , exponent);
        System.out.println(result);
    }
    /*
    Need to write the power function and print the output.
    */
    static long power(int b, int e) {
        if (e == 0) {
            return 1;
        }
        // else if (e == 1){
        //     return b;
        // }
        else {
            return b * power(b, e - 1);
        }
    }
}
