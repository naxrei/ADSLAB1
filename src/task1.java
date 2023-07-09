import java.util.Scanner;

public class task1 {
    /*
        @ getMin - definition of min
        @   n - length of array
        @   arr - array
        @ return - returning minimum of function
    */
    public static int getMin(int n, int[] arr) {
        int a = arr[n-1]; //get element of array in n-1 index
        if (n == 1) return a;
        int otherMin = getMin(n-1, arr); // move with n-1 length
        return a < otherMin ? a : otherMin; //return lesser
    }

    public static void main(){
        // basic input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a length of array:");
        int n = sc.nextInt();
        System.out.println("Write a " + n + " elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("The min value is: " + getMin(n, arr));
    }
}