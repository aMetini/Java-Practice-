public class Player {
    //Dice dice = new Dice();
    private String name;
    //private int totalPoints = dice.setRollVal(0);

    public Player(String playerName) {
        name = playerName;
    }

    public String getPlayerName() {
        return name;
    }

    public void setPlayerName(String playerName) {
        name = playerName;
    }
    
}
