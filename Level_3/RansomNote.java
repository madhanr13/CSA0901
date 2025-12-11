public class RansomNote {
    public static void main(String[] args) {
        String note = "aa";
        String magazine = "aab";

        if (canConstruct(note, magazine)) {
            System.out.println("True: You can write the note.");
        } else {
            System.out.println("False: Not enough letters.");
        }
    }

    public static boolean canConstruct(String note, String magazine) {
        int[] counts = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            counts[c - 'a']++; 
        }

        for (int i = 0; i < note.length(); i++) {
            char c = note.charAt(i);
            counts[c - 'a']--;

            if (counts[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}