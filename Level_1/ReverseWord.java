class ReverseWord{
    public static void main(String[] args) {
        String n = "Hello";
        String reversed = "";
        for(int i = n.length() - 1; i >= 0; i--){
            reversed += n.charAt(i);
        }
        System.out.println("Reversed Array: " + reversed); 
    }
}