public class DecimalConvert {
    public static void main(String[] args) {
        int num = 4;

        String binary = Integer.toBinaryString(num);
        String octal = Integer.toOctalString(num);

        System.out.println("binary: " + binary );
        System.out.println("octal: " + octal );
    }
}