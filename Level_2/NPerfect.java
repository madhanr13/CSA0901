public class NPerfect {
    public static void main(String[] args) {
        int start = 1;
        int end = 500;
        for(int num = start; num < end; num++){
            int sum = 0;
            for(int i = 1; i <= num / 2; i++){
                if(num % i == 0){
                    sum += i;
                }
            }
            if(sum == num){
                System.out.println(num);
            }
        }
        
    }
}
