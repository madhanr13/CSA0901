import java.util.Scanner;

public class LowUppUntilStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int upper = 0;
        int lower = 0;
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if(ch == '*'){
                break;
            }

            if(ch >= 'A' && ch <= 'Z'){
                upper++;
            } else if(ch >= 'a' && ch <= 'z'){
                lower++;
            }
        }
        System.out.println("Upper count: " + upper);
        System.out.println("Lower count: " + lower);
    }
}
