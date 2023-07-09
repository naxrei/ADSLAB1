import java.util.Scanner;

public class task6 {
    /*
        @getPower      - definition of power function
        @  base        - number that need to be multiplied 'power' times
        @  power       - count of iterations
        @return        - returning powered base in power
    */
    public static int getPower(int base, int power) {
        return switch (power) {
            case 0 -> 1;    // base case
            case 1 -> base; // base case
            default -> base * getPower(base, power-1); //multiply base power times from input
        };
    }

    public static void main() {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a num:");
        int base = sc.nextInt();
        System.out.println("Please write a power:");
        int power = sc.nextInt();

        System.out.println("The " + base + "^" + power + "=" + getPower(base, power));
    }
}
