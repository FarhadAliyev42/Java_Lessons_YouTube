public class SafeHouse extends NormalLocation {

    public SafeHouse(Player player, String name) {
        super(player, "Secure Home");
    }
    @Override
    public boolean getLocation(){
        player.setHealth(player.getRHealth()); 
        System.out.println("Your Health Filled!"); 
        System.out.println("Now you are in the Safe House"); 
        return true; 
    }
}
