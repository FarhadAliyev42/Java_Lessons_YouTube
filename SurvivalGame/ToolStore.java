public class ToolStore extends NormalLocation{

    public ToolStore(Player player) {
        super(player, "Store");
    }

    public boolean getLocation(){
        System.out.println("Money: " + player.getMoney());
        System.out.println("1. Weapons");
        System.out.println("2. Armors");
        System.out.println("3. Exit");
        System.out.println("Selection: "); 
        int selectTool = scan.nextInt(); 
        int selectItemID; 
        switch (selectTool) {
            case 1:
                selectItemID = weaponMenu(); 
                buyWeapon(selectItemID);
                break;
            case 2:
                selectItemID = armorMenu(); 
                buyArmor(selectItemID);
                break;  
            case 3: 
                System.out.println("Exiting from Store");
            default:
                break;
        } 
        return true; 
    }

    public int weaponMenu(){
        System.out.println("1. Pistol\t{Money: 25, Damage: 2}");
        System.out.println("2. Sword\t{Money: 35, Damage: 3}");
        System.out.println("3. Rifle\t{Money: 55, Damage: 7}");
        System.out.println("4. Exit ");
        System.out.println("Select Weapon: "); 
        int select = scan.nextInt(); 
        while(select < 1 || select > 4){
            System.out.println("Please select correct number.");
            select = scan.nextInt(); 
        }
        return select; 
    }

    public void buyWeapon(int itemID){
        int damage = 0; 
        int price = 0; 
        String weaponName = null; 
        switch (itemID) {
            case 1:
                damage = 2; 
                weaponName = "Pistol"; 
                price = 5; 
                break;
            case 2:
                damage = 3; 
                weaponName = "Sword"; 
                price = 35; 
                break; 
            case 3:
                damage = 7; 
                weaponName = "Rifle"; 
                price = 45; 
                break; 
            case 4: 
                System.out.println("Exiting from the Weapon Store");
                break; 
            default:
                damage = 2; 
                weaponName = "Pistol"; 
                price = 25; 
        } 
        if(price > 0){
            if(player.getMoney() >= price){
            player.getInventory().setDamage(damage); 
            player.getInventory().setWeaponName(weaponName);; 
            player.setMoney(player.getMoney() - price); 
            System.out.println("New Weapon: " + weaponName + ", " + "Old Damage: " + player.getDamage() + ", " + "New Damage: " + (player.getDamage() + player.getInventory().getDamage()) + "\t"); 
            System.out.println("Reamining Money: " + player.getMoney());
        }
        else System.out.println("Insufficient Fund!");
        }
    }

    public int armorMenu(){
        System.out.println("1. Light  {Money: 15, Damage: 1}");
        System.out.println("2. Normal  {Money: 25, Damage: 3}");
        System.out.println("3. Heavy  {Money: 40, Damage: 5}");
        System.out.println("4. Exit ");
        int select = scan.nextInt(); 
        while(select < 1 || select > 4){
            System.out.println("Please select correct number.");
            select = scan.nextInt(); 
        }
        return select; 
    }

    public void buyArmor(int itemID){
        int avoidDamage = 0; 
        int price = 0; 
        String armorName = null; 
        switch (itemID) {
            case 1:
                avoidDamage= 1; 
                armorName = "Light Armor"; 
                price = 15; 
                break;
            case 2:
                avoidDamage = 3; 
                armorName = "Normal Armor"; 
                price = 25; 
                break; 
            case 3:
                avoidDamage =5; 
                armorName = "Heavy Armor"; 
                price = 40; 
                break; 
            case 4: 
                System.out.println("Exiting from the Weapon Store");
                break; 
            default:
                avoidDamage = 1; 
                armorName = "Light Armor"; 
                price = 15; 
        } 
        if(price > 0){
            if(player.getMoney() >= price){
            player.getInventory().setArmor(avoidDamage);
            player.getInventory().setArmorName(armorName); 
            player.setMoney(player.getMoney() - price); 
            System.out.println("New Armor: " + armorName + ", " + "Avoided Damage: " + player.getInventory().getArmor()); 
            System.out.println("Reamining Money: " + player.getMoney());
        }
        else System.out.println("Insufficient Fund!");
        }
    }
}
