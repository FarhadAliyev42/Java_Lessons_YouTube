public abstract class Location { 
    protected Player player; 
    protected String name; 

    public Location(Player player){
        this.player = player; 
    } 

    public abstract boolean getLocation(); 

    public String getName() {
        return name;
    }
    public Player getPlayer() {
        return player;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPlayer(Player player) {
        this.player = player;
    } 

}
