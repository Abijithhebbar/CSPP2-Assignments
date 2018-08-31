
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{/*
    Do not modify this main function.
    */
    public static String binaryToDecimal(String s) {
        int len = s.length();
        int result = 0;
        for (int i = 0; i < len; i++) {
            // System.out.println(s.charAt(i));
            if (s.charAt(i) == 1) {
                result = result + 2^((len - 1) - i);
            }
        }
        return (result + "");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String res = binaryToDecimal(s);//Write binaryToDecimal function
            System.out.println(res);
        }
    }

}
