import java.util.*; 
// Must import all java Util 
// You can change Index with String etc. but no duplicate 

public class Main {
    public static void main(String[] args) { 
        // clear() --> Delete all values in the map 
        // get (Object key) --> Return object related to that Key 
        // put (Object key, Object value) --> store Key-Value relationship 

        HashMap b = new HashMap(); 
        b.put("Turkey", "Ankara"); //No same keys! No two or more "Turkey" 
        b.put("England", "London"); 
        b.put("France", "Paris"); 

        Set s = b.entrySet(); 
        Iterator it = s.iterator(); 

        while(it.hasNext()){ 
            Map.Entry item = (Map.Entry) it.next(); 
            System.out.println(item.getKey() + " -> " + item.getValue());
        } 
    }
}