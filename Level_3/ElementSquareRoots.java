import java.util.Scanner;
import java.lang.Math;


public class ElementSquareRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        System.out.println("\n--- Results ---");
        for (int i = 0; i < n; i++) {
            double original = numbers[i];
            double root = Math.sqrt(original);
            
            System.out.println("Square root of " + original + " is: " + root);
        }

        scanner.close();
    }
}