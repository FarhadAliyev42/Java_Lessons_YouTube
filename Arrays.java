import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        // DataType ArrayName[] = new DataType[ArraySize]; 
        // DataType[] ArrayName = new DataType[ArraySize]; 
        // DataType[] ArrayName = {values}; 

        int[] list = new int[4]; 
        Scanner s = new Scanner(System.in); 
        for(int i = 0; i < list.length; i++){
            list[i] = s.nextInt(); 
        }
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
        System.out.println("-------------");
        // foreach 
        for (int value: list){
            System.out.println(value);
        }
        s.close();
    }
}
