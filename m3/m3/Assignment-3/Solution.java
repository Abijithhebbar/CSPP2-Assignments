
import java.util.Scanner;
/*
    Do not modify this main function.
    */
class Solution {
/** solution class 
**/

    public static void main(String[] args) {
        /** main function
        /*/

        Scanner s = new Scanner(System.in); 
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        gcd(n1, n2);
        System.out.println(gcd(n1, n2));
    }
    public static int gcd(final int n1, final int n2) {
        /** gcd function
        **/
         if  (n2 == 0) {
            return n1;
        } else {
        return gcd(n2, (n1 % n2));
    }

    }
}
