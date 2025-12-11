import java.util.Scanner;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();

        double root = Math.sqrt(number);

        int nearestInteger = (int) root;

        if ((nearestInteger * nearestInteger) == number) {
            System.out.println(number + " is a Perfect Square.");
        } else {
            System.out.println(number + " is NOT a Perfect Square.");
        }

        scanner.close();
    }
}