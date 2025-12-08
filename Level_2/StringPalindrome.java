import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String reversed = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reversed += s.charAt(i);
        }
        if(s.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
