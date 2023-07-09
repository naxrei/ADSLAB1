import java.util.Arrays;
import java.util.Scanner;

public class task7 {
    /*
        @reverseArray      - definition of function
        @  arr             - array to be reversed
        @return            - None
    */
    public static void reverseArray(int[] arr) {
        reverse(arr, 0, arr.length-1);
    }
    /*
        @reverse       - definition of function
        @  arr         - array to be reversed
        @  start       - start index notation
        @  stop        - stop index notation
        @return        - None
    */
    public static void reverse(int[] arr, int start, int stop) {
        if (start < stop) {
            int temp = arr[start];
            arr[start] = arr[stop];
            arr[stop] = temp; //swapping edge elements
            reverse(arr, ++start, --stop); //continue
        }
    }

    public static void main() {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a length of array:");
        int n = sc.nextInt();
        System.out.println("Write a " + n + " elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        reverseArray(arr);
        System.out.println("Your current arrays is: " + Arrays.toString(arr));
    }
}
