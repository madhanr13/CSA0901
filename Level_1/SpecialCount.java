import java.util.Scanner;

public class SpecialCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int SpecialCount = 0;

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)){
                System.out.println(c);
                SpecialCount++;
            }
        }
        System.out.println(SpecialCount);
    }
}
