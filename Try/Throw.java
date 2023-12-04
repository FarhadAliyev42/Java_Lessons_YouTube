public class Throw {
    public static void main(String[] args) {
        int n = 0; 
        if(n == 0) {
            System.out.println("Cannot divide by zero!");
            throw new ArithmeticException("Exception !");
        }
        System.out.println("Program's continue");
    }
}
