
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        int i = 1, j, count = 0;
        for (i = 1; i <= n; i++)
        {
        	j = i % 10;
        	if (j == 7)
        	{
        		count =  count + 1;
        	}
        	

        }
        System.out.println(count);
       
        
    }
}