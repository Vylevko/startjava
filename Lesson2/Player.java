import java.util.Scanner;

public class Player {
    private String playerName;
    private int number;
    Scanner scan = new Scanner(System.in);
    
    public Player(String playerName) {
        this.playerName = playerName;
    }
    
    public String getPlayerName() {
        return playerName;
    }
    
    public int getNumber() {
        if (scan.hasNextInt()) {
            number = scan.nextInt();
        } else {
            scan.nextLine();
            number = 0;
        }
        return number;
    }
}