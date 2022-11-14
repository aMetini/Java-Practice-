import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public String firstPlayer;
    public String secondPlayer;
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    Player player1 = new Player(firstPlayer);
    Player player2 = new Player(secondPlayer);

    //public void requestPlayerNames(String firstPlayer, String secondPlayer) {
    public void requestPlayerNames() {
        System.out.println("Please enter your name Player One: ");
        firstPlayer = scan.nextLine();
        System.out.println("Please enter your name Player Two: ");
        secondPlayer = scan.nextLine();
    }

    public Player requestPlayerThrows(String firstPlayer, String secondPlayer) throws IOException {
        int totalOfPoints1 = 0;
        int totalOfPoints2 = 0;
        
        int[] player1rolls = new int[3];
        
        for (int i = 0; i < player1rolls.length; i++) {
            System.out.println(firstPlayer + " please press ENTER in order to throw the dice.");
            //String key = scan.nextLine();
            //char key = (char) System.in.read();
            System.in.read();
            Dice dice1 = new Dice();
            player1rolls[i] = dice1.throwDice();
            System.out.println(player1rolls[i]);
            totalOfPoints1 += player1rolls[i];

        }
        System.out.println(firstPlayer + "'s final score is: " + totalOfPoints1 + "!" );

        int[] player2rolls = new int[3];
        
        for (int i = 0; i < player2rolls.length; i++) {
            System.out.println(secondPlayer + " please press ENTER in order to throw the dice.");
            //String key = scan.nextLine();
            //char key = (char) System.in.read();
            System.in.read();
            Dice dice2 = new Dice();
            player2rolls[i] = dice2.throwDice();
            System.out.println(player2rolls[i]);
            totalOfPoints2 += player2rolls[i];

        }
        System.out.println(secondPlayer + "'s final score is: " + totalOfPoints2 + "!" );
        return player1; 
    }

    // public void comparePointsOfPlayers(String firstPlayer, String secondPlayer) {
    //     if (totalOfPoints(firstPlayer) > totalOfPoints(secondPlayer)) {
            
    //     }
    // }    

    public void runGame() throws IOException {
        requestPlayerNames();
        requestPlayerThrows(firstPlayer, secondPlayer);
    }
    
}
