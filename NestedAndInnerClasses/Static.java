package NestedAndInnerClasses;

public class Static {
    private int a = 10; 
    private static int b = 1; 

    public static class Inner{
        int a = 0; 
        public void run(){
            System.out.println(a);
            System.out.println(this.a); 
            System.out.println(b); 
        }
    }
}
