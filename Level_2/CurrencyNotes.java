import java.util.Scanner;

class ATM {
    private int n100;
    private int n200;
    private int n500;

    ATM(int n100, int n200, int n500) {
        this.n100 = n100;
        this.n200 = n200;
        this.n500 = n500;
    }

    int totalAmount() {
        return (n100 * 100) + (n200 * 200) + (n500 * 500);
    }

    void printReceipt() {
        System.out.println("Notes Summary:");
        System.out.println("100 x " + n100);
        System.out.println("200 x " + n200);
        System.out.println("500 x " + n500);
        System.out.println("Total Amount: ₹" + totalAmount());
    }
}

public class CurrencyNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of 100 notes: ");
        int n100 = sc.nextInt();

        System.out.print("Enter number of 200 notes: ");
        int n200 = sc.nextInt();

        System.out.print("Enter number of 500 notes: ");
        int n500 = sc.nextInt();

        if (n100 < 0 || n200 < 0 || n500 < 0) {
            System.out.println("Invalid input. Negative notes don’t exist.");
            return;
        }

        ATM atm = new ATM(n100, n200, n500);
        atm.printReceipt();
    }
}
