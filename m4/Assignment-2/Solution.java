import java.util.Scanner;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		int[][] arr1;
		int[][] arr2;
		int[][] sum;
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		arr1 = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		c = sc.nextInt();
		d = sc.nextInt();
		arr2 = new int[c][d];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < d; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		if (a == c && b == d) {
			sum = new int[a][b];
			for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.print("/n");
		}
		} else {
			System.out.println("not possible");
		}

	}
}