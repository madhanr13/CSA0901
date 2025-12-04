public class Matrix_add {
    
    public static void main(String[] args) {
        int a[][] = {{1, 1}, {2, 2}};
        int b[][] = {{3, 3}, {4, 4}};

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
            System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
