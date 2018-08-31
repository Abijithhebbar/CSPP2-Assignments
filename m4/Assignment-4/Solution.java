
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{/*
	Do not modify the main function 
	*/
	public static String reverseString(String s) {
		int len = s.length();
		String strrev = "";
		for (int i = (len - 1); i >= 0; i--) {
				strrev = strrev + s.charAt(i);

		}
		return strrev;
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String reverse=reverseString(s);	
		System.out.println(reverse);
		
	}
	//Write reverseString function

}
