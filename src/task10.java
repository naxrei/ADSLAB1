import java.util.Scanner;

public class task10 {
    /*
        @ getEuclidGCDAlgoReq - definition of gcd function
        @   a                 - first number from user
        @   b                 - second number from user
        @ return              - returning gcd of function
    */
    public static int getEuclidGCDAlgoReq(int a, int b) {
        if (b == 0) return a; //base case
        return getEuclidGCDAlgoReq(b, a % b); //Euclid's algorithm
    }
    public static void main() {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a num for a:");
        int a = sc.nextInt();
        System.out.println("Please write a num for b:");
        int b = sc.nextInt();

        System.out.println("GCD is: " + getEuclidGCDAlgoReq(a, b));
    }
}