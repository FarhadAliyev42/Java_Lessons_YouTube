package NestedAndInnerClasses;

public class Main {
    public static void main(String[] args){
        /* 
         Nested Class
             - Inner Class
                 - Static 
                 - Non-Static 
             - Local Class 
             - Anonymous Class 
        */
        NonStatic n = new NonStatic(); 
        NonStatic.Inner inner = n.new Inner(); 
        // inner.run(); 

        Static.Inner s = new Static.Inner(); 
        // s.run(); 

        Local l = new Local(); 
        // l.run(); 

        Anonymous a = new Anonymous() {
            public void run(){
                System.out.println("This is Anonymous Class's Run"); 
            }

            public void print(){
                System.out.println("Print"); 
            }
        }; 
        a.run(); 
        a.print(); 
    }
}
