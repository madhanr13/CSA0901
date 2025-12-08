import java.util.Scanner;

public class PosNegUntilMinus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int postiveCount = 0;
        int negativeCount = 0;

        while(true){
            System.out.println("Enter numbers: ");
            int num = sc.nextInt();

            if(num == -1){
                break;
            }else if(num > 0){
                postiveCount++;
            } else {
                negativeCount++;
            }
        }
        System.out.println("Positive Count: " + postiveCount);
        System.out.println("Negative Count: " + negativeCount);
    }
}
