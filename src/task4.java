import java.util.Scanner;

public class task4 {
    /*
        @getFactorial - definition of factorial function
        @   n         - number that need to be factorized
        @return       - returning factized n
    */
    public static int getFactorial(int n) {
        if (n == 1) { //base case
            return 1;
        } else {
            return n * getFactorial(n-1);
        }
    }

    public static void main() {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a number:");
        int n = sc.nextInt();

        System.out.println("The factorial is: " + getFactorial(n));
    }
}
