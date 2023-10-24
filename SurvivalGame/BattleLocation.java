public abstract class BattleLocation extends Location {
    private Obstacle obstacle; 

    public BattleLocation(Player player, String name, Obstacle obstacle) {
        super(player);
        this.name = name; 
        this.obstacle = obstacle; 
    }

    public boolean getLocation(){
        int obstacleCount = obstacle.count();
        System.out.println("Now you are in the " + this.getName());
        System.out.println("Be Careful! There are " + obstacleCount + " " + obstacle.getName() + "(s)"); 
        System.out.println("<F>ight or <R>un"); 
        String selectCase = scan.next(); 
        selectCase = selectCase.toUpperCase();  
        if(selectCase.equals("F")){
            if(combat(obstacleCount)){
                System.out.println("You killed all enemies in the " + this.getName()); 
                return true;
            }
            else System.out.println("You are dead!"); 
            return false; 
        }
        return true; 
    }

    public boolean combat(int obstacleCount){
        for(int i = 0; i < obstacleCount; i++){
            playerStats();
            enemyStats(); 
        }
        return true; 
    }

    public void playerStats(){
        System.out.println(); 
        System.out.println(); 
        System.out.println("Player Info:\n--------"); 
        System.out.println("Health: " + player.getHealth());
        System.out.println("Damage: " + player.getTotalDamage()); 
        System.out.println("Money: " + player.getMoney()); 
        if(player.getInventory().getDamage() > 0){
            System.out.println("Weapon: " + player.getInventory().getWeaponName()); 
        }
        else System.out.println("No Weapon");
        if(player.getInventory().getArmor() > 0){
            System.out.println("Armor: " + player.getInventory().getArmorName());
        }
        else System.out.println("No Armor"); 

    }
    public void enemyStats(){
        System.out.println();
        System.out.println();
        System.out.println(obstacle.getName() + " Info:\n--------"); 
        System.out.println("Health: " + obstacle.getHealth()); 
        System.out.println("Damage: " + obstacle.getDamage());
        System.out.println("Money Award: " + obstacle.getAwardMoney()); 
    }
}
