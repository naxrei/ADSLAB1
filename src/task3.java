import java.util.Scanner;

public class task3 {
    /*
        @getResultOfCheckingPrime        - definition of checking prime function
        @  n                             - number that need to check for prime
        @return                          - returning average of array
    */
    public static String getResultOfCheckingPrime(int n) {
        if (n > 1) {
            for (int i = 2; i < Math.sqrt(n) + 1; i++) { // nums after the sqrt(n) are dividable by past
                if (n % i == 0) return "Composite"; // check for a divisor if 0, then composite number
            }
            return "Prime"; // verdicted after the loop
        } else {
            return "Composite";
        }
    }
    public static void main() {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a num:");
        int n = sc.nextInt();
        System.out.println(n + " is " + getResultOfCheckingPrime(n) + "!");
    }
}