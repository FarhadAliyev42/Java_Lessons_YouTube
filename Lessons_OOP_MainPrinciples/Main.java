package Lessons_OOP_MainPrinciples;

public class Main {
    public static void main(String[] args){
        // Encapsulation 
        // Inheritence 
        // Polymorphism 
        // Abstraction   
        Book b1 = new Book("Harry Poter", "J.K Rowling", "UK Publisher", 412); 
        b1.setNumberOfPages(500); 
        System.out.println(b1.getNumberOfPages()); 
    }
} 