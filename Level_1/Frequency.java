// import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 5, 5, 5};
        int target = 4;
        int count = 0;

        for(int word: arr){
            if(target == word){
                count++;
            }
        }
        System.out.println(target + " occured " + count + " times.");

        // long count = Arrays.stream(arr).filter(n -> n == target).count();
        // System.out.println(target + " occured " + count + " times.");

    }
}
