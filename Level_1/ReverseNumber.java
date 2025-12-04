public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = 0;
        for(int i = 1; i <= 5; i++){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println(reversed);
    }
}
