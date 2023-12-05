public class GenericMethod {
    public <E> void genericMethod(E[] arr){
        // This is generic Method 
        for(E item : arr ){
            System.out.println(item);
        } 
    }
}
