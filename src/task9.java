import java.util.Scanner;

public class task9 {
    /*
        @getBinCoefficient   - definition of loop function
        @   n                - lower integer of C(coefficient) notation
        @   k                - upper integer of C(coefficient) notation
        @return              - returning binomial coefficient (int)
    */
    public static int getBinCoefficient(int n, int k) {
        if (k == n) return 1; //base case

        return switch (k) {
            case 0 -> 1; //base case
            default -> getBinCoefficient(n-1, k-1) + getBinCoefficient(n-1, k); //getBinCoefficient rule
        };
    }

    public static void main() {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a num for N:");
        int n = sc.nextInt();
        System.out.println("Please write a num for K:");
        int k = sc.nextInt();

        System.out.println("The binomial coefficient of n=" + n + " k=" + k +" is: " + getBinCoefficient(n, k));
    }
}
