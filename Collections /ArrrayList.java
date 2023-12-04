import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ArrrayList {
    public static void main(String[] args){ 
        // ArrayList<E> 
        // LinkedList <E> 
        // Vector <E> 

        ArrayList country = new ArrayList(); 
        country.add("Ankara"); 
        country.add("Baku"); 
        country.add("Moscow"); 
        country.add("Los Angeles"); 

        country.add(0, "Istanbul"); // add to the index 

        country.forEach(item -> System.out.println(item + " ")); 

        System.out.println("Linked List ---------------"); 

        LinkedList l = new LinkedList<>(); 
        l.add("One"); 
        l.add("2"); 
        l.add(5); 

        l.forEach(item -> System.out.println(item + " ")); 

        System.out.println("Vector --------------"); 

        Vector v = new Vector<>(); 
        System.out.println(v.capacity());
    }
}
