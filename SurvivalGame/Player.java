import java.util.Scanner;

public class Player {
    private int damage, health, money, rHealth; 
    private String name, charName; 
    private Inventory inventory; 
    Scanner scan = new Scanner(System.in); 
    
    public Player(String name){
        this.name = name; 
        this.inventory = new Inventory(); 
    }

    public void selectChar(){
        switch(charMenu()) {
            //Samurai selected s
            case 1: 
                initPlayer("Samurai", 5, 25, 15);
                break; 
            //Archer selected 
            case 2: 
                initPlayer("Archer", 7, 18, 20);
                break; 
            //Knight selected 
            case 3: 
                initPlayer("Knight", 8, 24, 5);
                break; 
            default: 
                initPlayer("Samurai", 5, 25, 15);
        }

        System.out.println("Selected Character: " + getCharName() + " \t " + "Damage: " + getDamage() + " \t " + "Health: " + getHealth() + " \t " + "Money: " + getMoney());
    }

    public int getTotalDamage(){
        return this.getDamage() + this.getInventory().getDamage(); 
    }

    public int charMenu(){
        System.out.println("Please select a character: ");
        System.out.println("- Samurai \t Damage: 5 \t Health: 21 \t Money: 15");
        System.out.println("- Archer \t Damage: 7 \t Health: 18 \t Money: 20");
        System.out.println("- Knight \t Damage: 8 \t Health: 24 \t Money: 5");
        System.out.println("Your Choice: ");
        int charID = scan.nextInt(); 

        while(charID < 1 || charID > 3){
            System.out.println("Please enter correct number.");
            charID = scan.nextInt(); 
        }

        return charID; 
    }

    public void initPlayer(String charName, int damage, int health, int money){
        setCharName(charName);
        setDamage(damage);
        setHealth(health);
        setMoney(money); 
        setRHealth(health); 
    }

    public String getCharName() {
        return charName;
    }
    public int getDamage() {
        return damage;
    }
    public int getHealth() {
        return health;
    }
    public Inventory getInventory() {
        return inventory;
    }
    public int getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }
    public int getRHealth() {
        return rHealth;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }public void setMoney(int money) {
        this.money = money;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRHealth(int rHealth) {
        this.rHealth = rHealth;
    }
}
