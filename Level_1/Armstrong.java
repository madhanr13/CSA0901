class Armstrong{
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int digits = 0;

        int temp = n;
        while(temp > 0){
            digits++;
            temp /= 10;
        }

        temp = n;
        while(temp > 0){
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        if(sum == n){
            System.out.println("It is armstrong");
        } else {
            System.out.println("It is not armstrong");
        }
    }
}