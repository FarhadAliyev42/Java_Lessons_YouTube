package NestedAndInnerClasses;

public class Local {
    public void run(){
        class Local2{
            int a = 10; 
            Local2(int a){
                this.a = a; 
            }
            public void print(){
                System.out.println(a); 
            }
        }
        Local2 l = new Local2(5); 
        l.print();
    }
}
