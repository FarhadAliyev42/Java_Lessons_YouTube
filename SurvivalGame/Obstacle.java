import java.util.Random;

public class Obstacle {
    private String name; 
    private int damage, awardMoney, health, maxNumber; 
    
    public Obstacle(String name, int damage, int awardMoney, int health, int maxNumber){
        this.name = name; 
        this.damage = damage; 
        this.awardMoney = awardMoney; 
        this.health = health; 
        this.maxNumber = maxNumber; 
    }

    public int count(){
        Random r = new Random(); 
        return r.nextInt(this.maxNumber) + 1; 
    }

    public int getAwardMoney() {
        return awardMoney;
    }
    public int getDamage() {
        return damage;
    }
    public int getHealth() {
        return health;
    }
    public int getMaxNumber() {
        return maxNumber;
    }
    public String getName() {
        return name;
    }
    
    public void setAwardMoney(int awardMoney) {
        this.awardMoney = awardMoney;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
}
