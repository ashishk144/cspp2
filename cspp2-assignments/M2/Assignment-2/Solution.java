import java.util.Scanner;
// import java.lang.Math;
/**
Writing a program for finding square roots of quadratic equations.*/
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * { item_description }
         */
    }
    /**
     * Writing a class solution.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        roots(a, b, c);
    }
    /**
     * Roots of quadratic equation function.
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    static void roots(final int a, final int b, final int c) {
    // System.out.println("abc");
    // System.out.println(b*b);
    // System.out.println(((b*b)-(4*a*c)));
    final int four = 4;
    if (((b * b) - (four * a * c)) >= 0) {
    double root1 = (-b + Math.sqrt(((b * b) - (four * a * c)))) / (2 * a);
    double root2 = (-b - Math.sqrt(((b * b) - (four * a * c)))) / (2 * a);
    System.out.println(root1 + " " + root2);
    // System.out.println(root_2);
    }
    // else{
    //  double root_1_sqrt = Math.sqrt(Math.abs((b*b)-(four*a*c)));
    //  // double root_2_sqrt = Math.sqrt(abs((b*b)-(four*a*c)));
    //  System.out.println(-b + "/" + 2*a + "+i" + root_1_sqrt + "/" + 2*a);
    //  System.out.println(-b + "/" + 2*a + "-i" + root_1_sqrt + "/" + 2*a);
    // }
    }
}

