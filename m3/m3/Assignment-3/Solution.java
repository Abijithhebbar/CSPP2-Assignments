import java.util.Scanner;
/**
 * @brief [brief description]
 * @details [long description]
 * @return [description]
 */

final class Solution {
    /**
     * @brief [brief description]
     * @details [long description]
     * @return [description]
     */
    private Solution() { }
    /**
     * @brief [brief description]
     * @details [long description]
     * 
     * @param String [description]
     */
    public static void main(final String[] args) {     
        /**
         * @brief brief description.
         * @details long description.
         * 
         * @param  args 
         * @return [description]
         **/
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        gcd(n1, n2);
        System.out.println(gcd(n1, n2));
    }
    public static int gcd(final int n1, final int n2) {
        /**
         * @brief n1, n2
         * @details [long description]
         * 
         * @return [gcd]
         **/
         if  (n2 == 0) {
            return n1;
        } else {
        return gcd(n2, (n1 % n2));
    }

    }
}
