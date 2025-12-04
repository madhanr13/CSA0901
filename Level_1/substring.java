import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String mainstr = sc.nextLine();
        String substr = sc.nextLine();

        if(mainstr.contains(substr)){
            System.out.println("It is a substring");
        } else {
            System.out.println("It is not a substring");
        }
    }
}
