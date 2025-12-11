import java.util.Scanner;

public class NthFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter N (which factor to find): ");
        int n = scanner.nextInt();

        int count = 0;
        boolean found = false;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (count == n) {
                    System.out.println("The " + n + "th factor of " + number + " is: " + i);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("The number " + number + " does not have " + n + " factors.");
        }

        scanner.close();
    }
}