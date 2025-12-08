import java.util.Arrays;
import java.util.Scanner;

public class MthMaxNthMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter m (max position): ");
        int m = sc.nextInt();

        System.out.print("Enter n (min position): ");
        int n = sc.nextInt();

        if (m < 1 || m > size || n < 1 || n > size) {
            System.out.println("Invalid m or n");
            return;
        }

        Arrays.sort(arr);

        int nthMin = arr[n - 1];
        int mthMax = arr[size - m];

        int sum = nthMin + mthMax;
        int diff = mthMax - nthMin;

        System.out.println("m-th Maximum: " + mthMax);
        System.out.println("n-th Minimum: " + nthMin);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
    }
}
