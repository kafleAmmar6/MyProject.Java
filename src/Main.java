import java.util.*;

public class Main {
    public static void main() {

      Scanner input = new Scanner(System.in);

                System.out.print("Enter a number: ");
                int number = input.nextInt();

                int originalNumber = number;   // store the number
                int reverse = 0;

                // reverse the number
                while (number != 0) {
                    int digit = number % 10;            // get last digit
                    reverse = reverse * 10 + digit;     // build reverse number
                    number = number / 10;               // remove last digit
                }

                // check palindrome
                if (originalNumber == reverse) {
                    System.out.println(originalNumber + " is a Palindrome.");
                } else {
                    System.out.println(originalNumber + " is NOT a Palindrome.");
                }
            }
        }