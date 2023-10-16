package Lessons_OOP_MainPrinciples;

public class Book {
    String name, author, publisher; 
    private int numberOfPages; 

    Book(String name, String author, String publisher, int numberOfPages){
        this.name = name; 
        this.author = publisher; 
        this.publisher = publisher; 
        if(numberOfPages < 1){
            this.numberOfPages = 10; 
        }
        else{
            this.numberOfPages = numberOfPages; 
        }
    }

    public int getNumberOfPages(){
        return this.numberOfPages; 
    }

    public void setNumberOfPages(int number){
        if(number < 1){
            System.out.println("Page Number Cannot Be Negative.");
            this.numberOfPages = 10; 
        }
        else{
        this.numberOfPages = number; 
        }

    }

    public String getName(){
        return this.name; 
    }

    public void setName(String name){
        this.name = name; 
    } 
}
