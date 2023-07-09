import java.util.Scanner;

public class task5 {
    /*
        @getFib       - definition of fibonacci finder function
        @   n         - n-th place of number on fibonacci sequence
        @return       - returning n-th number on fibonacci seq
    */
    public static int getFib(int n) {
        return switch (n) {
            case 0 -> 0; // base case
            case 1 -> 1; // base case
            default -> getFib(n - 1) + getFib(n - 2); // fibonacci sequence rule
        };
    }

    public static void main() {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a num:");
        int n = sc.nextInt();
        System.out.println("The fibonacci value is: " + getFib(n));
    }
}
