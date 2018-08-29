import java.util.Scanner;
/**
 *this is a solution.
 */

final class Solution {
    /**
     * hell.
     */
    private Solution() { }
    /**
     * @param args [description]
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        gcd(n1, n2);
        System.out.println(gcd(n1, n2));
    }

    /**
     * @param n2 num
     * @param n1 num
     * @return [description]
     */

    public static int gcd(final int n1, final int n2) {
        if  (n2 == 0) {
            return n1;
        } else {
        return gcd(n2, (n1 % n2));
    }

    }
}
