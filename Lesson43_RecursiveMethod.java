public class Lesson43_RecursiveMethod{
    int result = 0; 
    static int recursive(int x){
        if(x == 1){
            return 1; 
        }
        return recursive(x-1) + x; 
    }
    public static void main(String[] args){
        System.out.println(recursive(2));
    }
}