package Lesson46_Classes;

public class Calculator {
    public int number1;
    public int number2; 
    public String color; 

    Calculator(int number1, int number2, String color){
        this.number1 = number1;
        this.number2 = number2; 
        this.color = color; 
    }

    public int sum(){
        return this.number1 + this.number2; 
    }
}
