import java.util.Scanner;

public class PalindromeAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        while (!isPalindrome(number)) {
            int reversed = reverseNumber(number);
            int sum = number + reversed;
            System.out.println(number + " + " + reversed + " = " + sum);
            number = sum; 
        }

        System.out.println("\nFinal Palindrome: " + number);
    }

    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;       
            reverse = reverse * 10 + digit; 
            n = n / 10;   
        }
        return reverse;
    }
}