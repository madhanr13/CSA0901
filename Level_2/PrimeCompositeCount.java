import java.util.Scanner;

public class PrimeCompositeCount {
    public static void main(String[] args) {
        int primeCount = 0;
        int compCount = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers?: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Enter numbers: ");
            int num = sc.nextInt();

            if(num <= 1){
                continue;
            }

            boolean IsPrime = true;
            if(num == 2){
                IsPrime = false;
            } else if(num % 2 == 0){
                IsPrime = true;
            } else{
                for(int j = 3; j * j < num; j+=2){
                    if(num % j == 0){
                        IsPrime = false;
                        break;
                    }
                }
            }
            if(IsPrime){
                primeCount++;
            } else{
                compCount++;
            }
        }
        System.err.println("Prime: "+ primeCount);
        System.err.println("Prime: "+ compCount);
    }
}
