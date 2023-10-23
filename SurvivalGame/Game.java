import java.util.Scanner;

public class Game {
    Player player; 
    Location location; 
    Scanner scan = new Scanner(System.in); 
    public void login(){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Welcome to Advanture Game!");
        System.out.print("Please Enter your Name: ");
        // String playerName = scan.nextLine(); 
        player = new Player("Farhad"); 
        player.selectChar(); 
        start();
        scan.close(); 
    }

    public void start(){ 
        while(true){
        System.out.println(); 
        System.out.println("=============="); 
        System.out.println(); 
        System.out.println("Please select location: "); 
        System.out.println("1. Secure Home --> Secure Place belongs to You, No Enemy!"); 
        System.out.println("2. Cave --> You may face with zombies!"); 
        System.out.println("3. Forest --> You may face with Vampires!"); 
        System.out.println("4. River --> You may face with Bears!"); 
        System.out.println("5. Tool Store --> You can buy weapon or armor!"); 
        System.out.println("Selected Number: ");
        int selectLoc = scan.nextInt(); 
        while(selectLoc < 1 || selectLoc > 5){
            System.out.println("Please enter correct number.");
            selectLoc = scan.nextInt(); 
        }

        switch(selectLoc){
            case 1: 
                location = new SafeHouse(player, null);
                break; 
            default: 
                location = new SafeHouse(player, null);
        }
        location.getLocation(); 
    }
    } 
} 
