/**
 // Given an String, Write a java method that
 returns the decimal value for the given binary string.
 **/
import java.util.Scanner;
/**
 import function.
**/
final class Solution {
/**
 class.
 **/
 private Solution() {
    /**
     default constructor.
     **/
 }
/**.
 * @param s input.
 * @return strrev.
 **/
    public static String reverseString(final String s) {
        int len = s.length();
        String strrev = "";
        for (int i = (len - 1); i >= 0; i--) {
                strrev = strrev + s.charAt(i);

        }
        return strrev;
    }
    /**.
     * @param args input.
     **/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    //Write reverseString function

}
