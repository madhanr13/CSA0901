import java.util.Scanner;

public class VowelsCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine().toLowerCase();

        int vowelCount = 0;
        int ConsCount = 0;

        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.print(ch);
                vowelCount++;
            } else {
                System.out.print(ch);
                ConsCount++;
            }
        }
        System.out.println(vowelCount);
        System.out.println(ConsCount);
    }
}
