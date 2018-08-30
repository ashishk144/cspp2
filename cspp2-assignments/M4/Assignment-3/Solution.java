
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
// import java.util.Math;
/**
 * Class Solution
 */
final class Solution {
    /**
     * Main function
     *
     * @param      args  The arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++) {
            String s = sc.nextLine();
            String res = binaryToDecimal(s);//Write binaryToDecimal function
            System.out.println(res);
        }
    }
    /**
     * Conversion function
     *
     * @param      str     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static String binaryToDecimal(final String str) {
        // System.out.println(str);
        int l = str.length()-1;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int s = Integer.parseInt(str.charAt(i) + "");
            // System.out.println(s);
            if (s == 1) {
                sum += Math.pow(2 ,l);
            }
            l -= 1;
        }
        return Integer.toString(sum);
    }
}
