package Lesson46_Classes;
public class Lesson46_OOP_Classes {
    public static void main(String[] args){
        // ClassName ObjectName = new ClassName; 
        // Constractor: Calculator() --> Part after "New" 
        Calculator calc1 = new Calculator(1,3,"red"); 
        Calculator calc2 = new Calculator(5, 7, "White"); 
        System.out.println(calc1.sum()); 
        System.out.println(calc2.sum()); 
        System.out.println(calc2.color); 
    }
}
