import java.util.Scanner;
import java.lang.Math;
/**
Writing a program for finding square roots of quadratic equations*/
public class Solution {
    /**
     * Writing a class solution
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        /**
         * Main Function
         */
        Scanner scan = new Scanner(System.in);
        final int a = scan.nextInt();
        final int b = scan.nextInt();
        final int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    static void rootsOfQuadraticEquation(int a, int b, int c) {
    /**
     * Roots of quadratic equation function
     */
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
    // System.out.println("abc");
    // System.out.println(b*b);
    // System.out.println(((b*b)-(4*a*c)));
    if (((b * b) - (4 * a * c)) >= 0) {
    double root1 = (-b + Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a);
    double root2 = (-b - Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a);
    System.out.println(root1 + " " + root2);
    // System.out.println(root_2);
    }
    // else{
    //  double root_1_sqrt = Math.sqrt(Math.abs((b*b)-(4*a*c)));
    //  // double root_2_sqrt = Math.sqrt(abs((b*b)-(4*a*c)));
    //  System.out.println(-b + "/" + 2*a + "+i" + root_1_sqrt + "/" + 2*a);
    //  System.out.println(-b + "/" + 2*a + "-i" + root_1_sqrt + "/" + 2*a);
    // }
    }
}
