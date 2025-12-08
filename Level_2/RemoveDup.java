import java.util.Scanner;

public class RemoveDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter numbers:");
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }

        int newLength = 0;
        for(int i = 0; i < n; i++){
            boolean found = false;
            for(int j = 0; j < newLength; j++){
                if(arr[i] == arr[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                arr[newLength++] = arr[i];
            }
        }
        System.out.println("After removing duplicates: ");
        for(int i = 0; i < newLength; i++){
            System.out.println(arr[i] + " ");
        }
        
    }
}
