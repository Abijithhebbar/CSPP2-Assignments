import java.util.Scanner;
/**
 * class.
 **/
final class Solution
{ /*
    Fill this main function to print maximum of given array
    */
    /**
     * default constructor.
     */
    private Solution() {
        /**
         default constructor
         **/
    }
    /**
     * @brief [brief description].
     * @details [long description].
     * @param args [description].
     **/
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr;
        int temp = 0;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                if (arr[i] > arr[i + 1]) {
                    if (temp < arr[i]) {
                    temp = arr[i];
                }
            }
            if (temp > arr[n - 1]) {
                temp = temp;
            } else {
                temp = arr[n - 1];
            }
            }
        }
        System.out.println(temp);
    }
}

