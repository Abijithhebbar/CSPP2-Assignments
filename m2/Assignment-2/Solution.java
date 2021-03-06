import java.util.Scanner;
// import java.lang.Math;
/**
*java code to print the quadractic values.
*/
public final class Solution {
    /**
    *default constructor.
    */
    private Solution() {

    }
    /**
    *Do not modify this main function.
    *@param args string
    */
    public static void main(final String[] args) {
        /**
        *main method
        */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        roots(a, b, c);
    }
    /**
    *Need to write the rootsOfQuadraticEquation.
    *function and print the output.
    *@param a int
    *@param b int
    *@param c int
    */
    public static void roots(final int a, final int b, final int c) {
        /**
        *function to get the results.
        */
        double descriminant = Math.sqrt(b * b - 2 * 2 * a * c);
        double result1 = (-b + descriminant) / (2 * a);
        double result2 = (-b - descriminant) / (2 * a);
        System.out.println(result1 + " " + result2);
    }
}

