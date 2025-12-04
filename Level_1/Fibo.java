public class Fibo {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 10;

        System.out.println("Fibonacci Series: ");
        for(int i = 1; i <=n; i++){
            System.out.print(a + " ");
            int temp = a + b;
            b = a;
            a = temp;
        }
    }
}
