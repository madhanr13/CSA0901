import java.util.Scanner;

public class VowelsInString {
    public static void main(String[] args) {
        int vowelCount = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println(ch);
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}
