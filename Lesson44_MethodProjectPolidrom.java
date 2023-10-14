import java.util.Scanner;

public class Lesson44_MethodProjectPolidrom {
    static boolean isPolidrom(int n){
        int temp, reverse_n, remain_n; 
        temp = n; 
        reverse_n = 0; 

        while(temp != 0){
            remain_n = temp % 10; 
            reverse_n = reverse_n * 10 + remain_n; 
            temp /= 10; 
        }

        if(n == reverse_n){
            return true;
        }
        else{
        return false; 
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close(); 
        System.out.println(isPolidrom(n));
    }
}
