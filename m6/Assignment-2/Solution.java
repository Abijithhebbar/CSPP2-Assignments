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
int z = 2, b = z + 1, c = z +z, d = z + b, e = b + b, f = b + c, g = c + c, h = c + d;
int  k = 2 * d, l = 100, m = 200, n = 300, o = 400, p = 500;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            a[i][j] = a[i][j] / 50;
            if (a[i][j] == 0) {
                a[i][j] = 0;
            } else if (a[i][j] == 1 || a[i][j] == 2) {
                a[i][j] = l;
            } else if (a[i][j] == b || a[i][j] == c) {
                a[i][j] = m;
            } else if (a[i][j] == d || a[i][j] == e) {
                a[i][j] = n;
            } else if (a[i][j] == f || a[i][j] == g) {
                a[i][j] = o;
            } else if (a[i][j] == h || a[i][j] == k) {
                a[i][j] = p;
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
