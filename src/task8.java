import java.util.Scanner;

public class task8 {
    /*
        @loop         - definition of loop function
        @   letter    - String to check for int
        @return       - returning "Yes" or "No"
    */
    public static String loop(String letter) {
        return recognizeString(letter.split(""), 0, letter.length());
    }

    /*
        @recognizeString   - definition of recognizing function
        @   arr            - string splited into array
        @   pos            - current position to check char
        @   stop           - stop position of arr (arr.length-1)
        @return            - returning "Yes" or "No"
    */
    static String recognizeString(String[] arr, int pos, int stop) {
        if (pos < stop) {
            if (isNum(arr[pos])) {
                return recognizeString(arr, ++pos, stop); // loop for checking every char in String
            } else {
                return "No"; // if not passed then it's not integer char
            }
        }
        return "Yes"; // default if everything is okay
    }
    /*
        @isNum        - definition of checking is num function
        @   s         - string to check is integer
        @return       - returning true/false
    */
    static boolean isNum(String s) {
        try {
            Integer.parseInt(s); //while parsing non int representation exception could be a corrupted
            return true; // if no exception then it's int
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main() {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a string to check is it number:");
        String n = sc.nextLine();
        System.out.println("Is this string a num? " + loop(n));
    }
}
