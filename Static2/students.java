package Static2;

public class students {
    String name; 
    int id; 
    public static int counter = 0; 

    public students(String name, int id){
        this.name = name; 
        this.id = id; 
        students.counter++; 
    }
}
