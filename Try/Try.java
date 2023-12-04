public class Try {
    public static void main(String[] args){
        System.out.println("Program started");
        int n = 0; 
        
        try{
            n=n/0;
            System.out.println("Inside Try"); 
            System.out.println(n);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Program finished");
    }
} 