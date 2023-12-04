import java.util.*; 

public class SetInterfaceAndHastSet {
    public static void main(String[] args){ 
        // HashSet<E> 
        // LinkedHashList<E> 
        // TreeSet<E> 
        
        HashSet h = new HashSet(); 
        h.add("12"); 
        h.add(12); 
        h.add(true); 
        h.add(null); 

        // h.remove(true); 
        Iterator itr = h.iterator(); 

        while(itr.hasNext()){ 
            System.out.println(itr.next()); 
        }

        System.out.println(h.contains(100)); 
        System.out.println("-------"); 

        h.forEach(item -> System.out.println(item + " "));  




        System.out.println("LinkedHastSet ----------------"); 

        LinkedHashSet days = new LinkedHashSet<>(); 
        days.add("Monday"); 
        days.add("Tuesday"); 
        days.add("Wednesday"); 
        days.add("Monday"); 
        days.add(null); 

        days.forEach(item -> System.out.print(item + ", "));




        System.out.println("TreeSet ------------------"); 

        // storing in increasing order 
        // Don't accept null 

        TreeSet tree = new TreeSet<>(); 
        tree.add(10); 
        tree.add(2); 

        tree.forEach(item -> System.out.println(item + " "));
    }
}