import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(); // if remove <Integer> will not work, except "Object obj"
        arr.add(1); 
        arr.add(2); 
        
        for(Integer obj : arr){
            System.out.println(obj); 
        } 

        System.out.println("-------");

        HashMap<Integer,String> h = new HashMap<>(); 
        h.put(1, "Ankara"); 
        h.put(2, "Moscow"); 
        h.put(3, null); 

        for(Integer key : h.keySet()){
            System.out.println(key + " " + h.get(key)); 
        } 
        System.out.println("-------"); 

        Test<Integer> i = new Test<Integer>(15); // Set data type to T 
        System.out.println(i.obj); 
        System.out.println("-------"); 

        Integer[] intArray = {1,2,3}; 
        Double[] doubleArray = {1.2, 2.1, 3.2}; 
        Character[] charArray = {'a', 'b', 'c'};
    }
}