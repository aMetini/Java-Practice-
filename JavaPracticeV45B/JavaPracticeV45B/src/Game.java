import java.io.IOException;
import java.util.Scanner;

public class Game {
    public Player firstPlayer;
    public Player secondPlayer;
    Scanner scan = new Scanner(System.in);

    public void requestPlayerNames() {
        System.out.println("Please enter your name Player One: ");
        firstPlayer = new Player(scan.nextLine());
        System.out.println("Please enter your name Player Two: ");
        secondPlayer = new Player(scan.nextLine());
    }

    public Player requestPlayerThrows(Player player) throws IOException {
        int totalOfPoints = 0;
        Dice dice = new Dice();
        int[] playerRolls = new int[3];
        
        for (int i = 0; i < playerRolls.length; i++) {
            System.out.println( player.getPlayerName() + " please press ENTER in order to throw the dice.");
            System.in.read();
            
            playerRolls[i] = dice.throwDice();
            System.out.println(playerRolls[i]);
            totalOfPoints += playerRolls[i];
        }

        player.setTotalPoints(totalOfPoints);
        System.out.println(player.getPlayerName() + "'s final score is: " + player.getTotalPoints() + "!" );
        return player; 
    }

    public void comparePointsOfPlayers(Player firstPlayer, Player secondPlayer) {
        if(firstPlayer.getTotalPoints() > secondPlayer.getTotalPoints()) {
            System.out.println("Player One is the winner with the most number of points!");
        } else if(firstPlayer.getTotalPoints() < secondPlayer.getTotalPoints()) {
            System.out.println("Player Two is the winner with the most number of points!");
        } else {
            System.out.println("This game is a draw! All players received the same number of points.");
        }
    }    

    public void runGame() throws IOException {
        requestPlayerNames();
        requestPlayerThrows(firstPlayer);
        requestPlayerThrows(secondPlayer);
        comparePointsOfPlayers(firstPlayer, secondPlayer);
    }
    
}
