public class SafeHouse extends NormalLocation {

    public SafeHouse(Player player) {
        super(player, "Secure Home");
    }
    @Override
    public boolean getLocation(){
        player.setHealth(player.getRHealth()); 
        System.out.println("Your Health Fulled!"); 
        System.out.println("Now you are in the Safe House"); 
        return true; 
    }
}
