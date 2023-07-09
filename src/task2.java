import java.util.Scanner;

public class task2 {
    /*
        @ getSum              - definition of sum function
        @   n                 - length of array
        @   arr               - array of numbers to sum
        @ return              - returning sum of array
    */
    public static float getSum(int n, int[] arr){
        int a = arr[n-1];
        if (n == 1) return a; //base case
        return a + getSum(n-1, arr); //summing all numbers of array
    }
    /*
        @getAverage          - definition of average function
        @  n                 - length of array
        @  arr               - array of numbers to find average
        @return              - returning average of array
    */
    public static float getAverage(int n, int[] arr) {
        float sm = getSum(Integer.valueOf(n), arr);
        return sm/n;
    }
    public static void main() {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a length of array:");
        int n = sc.nextInt();
        System.out.println("Write a " + n + " elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("The average value is: " + getAverage(n, arr));
    }
}
