public class Player {
    //Dice dice = new Dice();
    private String name;
    private int totalPoints;

    public Player(String playerName) {
        name = playerName;
        totalPoints = 0;
    }

    public String getPlayerName() {
        return name;
    }

    public void setPlayerName(String playerName) {
        name = playerName;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
    
}
