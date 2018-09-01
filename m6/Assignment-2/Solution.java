import java.util.Scanner;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest 100.
 *
 * @author :
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] roundHundred(final int[][] a,
     final int rows, final int columns) {
int z = 2, b = z + 1, c = z + z, d = z + b, e = b + b;
int f = b + c, g = c + c, h = c + d;
int  k = 2 * d;
int l = k * k, m = l * z, n = l * b, o = l * c, p = l * d;
int y = l / 2;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            int remainder = a[i][j] % 100;
            int rounded = 0;
            if (remainder >= 50) {
            rounded = a[i][j] - remainder + 100;
            } else {
             rounded = a[i][j] - remainder;
            }
            }
        }
        return a;
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}
