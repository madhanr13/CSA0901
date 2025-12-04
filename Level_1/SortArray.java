import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many words you want to print?");
        int count = sc.nextInt();
        sc.nextLine();

        String[] words = new String[count];
        System.out.println("Enter " + count + " words: ");
        for(int i = 0; i < count; i++){
            words[i] = sc.nextLine();
        }
        Arrays.sort(words);
        System.out.println("Sorted Array: ");
        for(String word: words){
            System.out.println(word);
        }
    }
}
