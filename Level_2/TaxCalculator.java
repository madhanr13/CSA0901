import java.util.Scanner;

public class TaxCalculator {

    double calculateTax(double income) {
        double tax = 0;

        if (income > 1000000) {
            tax += (income - 1000000) * 0.30;
            income = 1000000;
        }
        if (income > 500000) {
            tax += (income - 500000) * 0.20;
            income = 500000;
        }
        if (income > 250000) {
            tax += (income - 250000) * 0.05;
        }

        return tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();

        if (income < 0) {
            System.out.println("Invalid income.");
            return;
        }

        TaxCalculator t = new TaxCalculator();
        double tax = t.calculateTax(income);

        System.out.println("Tax to be paid: ₹" + tax);
    }
}
