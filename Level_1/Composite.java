public class Composite {
    public static void main(String[] args) {
        int n = 6;
        int factors = 0;

        for(int i = 1; i <= n; i++){
            if (n % i == 0){
                factors++;
                System.out.println(i);
            }
        }
        if(factors > 2){
            System.out.println("Composite Number with " + factors + " factors");
        } else {
            System.out.println("Not a composite number");
        }
    }
}
