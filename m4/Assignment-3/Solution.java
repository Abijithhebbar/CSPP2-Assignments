import java.util.Scanner;
/**.
class.
**/
final class Solution { /*
    Do not modify this main function.
    */
    /**
     default constructor.
     */
    private Solution() {
        /**
         default constructor.
         **/
            }
            /**.
         * @param s input string.
         * @return result1.
         **/

    public static String binaryToDecimal(final String s) {

        int len = s.length();
        double result = 0;
        for (int i = 0; i < len; i++) {
            //System.out.println(s.charAt(i));
            if (s.charAt(i) == '1') {
                result = result + Math.pow(2, ((len - 1) - i));
            }
        }
        String result1 =  result + "";
        return (result1.substring(0, (result1.length() - 2)));
    }
    /**. 
     * @param args argument.
     **/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String res = binaryToDecimal(s); //Write binaryToDecimal function
            System.out.println(res);
        }
    }

}
