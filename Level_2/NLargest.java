import java.util.Arrays;
import java.util.Scanner;

public class NLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        System.out.println("Enter elements: ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Which largest? ");
        int k = sc.nextInt();
        
        if(k < 0 || k > n){
            System.err.println("Invalid N.");
        }
        Arrays.sort(arr);
        int res = arr[n - k];
        System.out.println(k + "th largest: " + res);
    }
}
