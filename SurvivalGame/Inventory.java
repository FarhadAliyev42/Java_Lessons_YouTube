public class Inventory {
    private boolean water, food, firewood; 
    private String weaponName, armorName; 
    private int damage, armor; 

    Inventory(){
        this.water = false; 
        this.food = false; 
        this.firewood = false; 
        this.damage = 0 ; 
        this.armor = 0; 
        this.weaponName = null; 
        this.armorName = null; 
    }

    public int getArmor() {
        return armor;
    }
    public String getArmorName() {
        return armorName;
    }
    public int getDamage() {
        return damage;
    }
    public String getWeaponName() {
        return weaponName;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }
    public void setFood(boolean food) {
        this.food = food;
    }
    public void setWater(boolean water) {
        this.water = water;
    }
    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
