import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 10, 20, 40, 80};
        int[] array2 = {6, 7, 20, 80, 100};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.print("Common Elements: ");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                }
            }
        }
    }
}