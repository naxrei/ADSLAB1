import java.util.Scanner;

public class Main {
    public static float getSum(int n, int[] arr) {
        int a = arr[n-1];
        if (n==1) return a;
        return a +getSum(n-1, arr);
    }

public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write an length of array:");
        int n = sc.nextInt();
        System.out.println("Write a " + n + " elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr [i] = sc.nextInt();

        System.out.println("Sum of Numbers: " + getSum(n, arr));
    }
}
