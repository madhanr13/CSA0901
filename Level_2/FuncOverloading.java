class InterestCalculator {

    void interest(double principal) {
        double rate = 5.0;
        double interest = (principal * rate) / 100;
        System.out.println("Interest: " + interest);
    }
    void interest(double principal, double rate) {
        double interest = (principal * rate) / 100;
        System.out.println("Interest: " + interest);
    }
    void interest(double principal, double rate, int years) {
        double total = principal * rate * years / 100;
        System.out.println("Interest for " + years + " years: " + total);
    }
}

public class FuncOverloading {
    public static void main(String[] args) {
        InterestCalculator calc = new InterestCalculator();

        calc.interest(10000);              
        calc.interest(10000, 7.5);         
        calc.interest(10000, 7.5, 3);      
    }
}
