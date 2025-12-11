public class Permutations {

    public static void main(String[] args) {
        String input = "simats";
        printPermutations("", input);
    }

    public static void printPermutations(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char pickedChar = remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            printPermutations(prefix + pickedChar, newRemaining);
        }
    }
}