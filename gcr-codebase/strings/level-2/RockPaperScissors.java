import java.util.Scanner;

public class RockPaperScissors {
    
    // getting computer choice
    public static String getComputerChoice() {
        int random = (int)(Math.random()*3);
        
        if(random==0){
            return "rock";
        }
        else if(random==1){
            return "paper";
        }
        else{
            return "scissors";
        }
    }
    
    
    // finding winner
    public static String findWinner(String playerChoice, String computerChoice) {
        
        if(playerChoice.equals(computerChoice)){
            return "tie";
        }
        
        if(playerChoice.equals("rock") && computerChoice.equals("scissors")){
            return "player";
        }
        else if(playerChoice.equals("rock") && computerChoice.equals("paper")){
            return "computer";
        }
        else if(playerChoice.equals("paper") && computerChoice.equals("rock")){
            return "player";
        }
        else if(playerChoice.equals("paper") && computerChoice.equals("scissors")){
            return "computer";
        }
        else if(playerChoice.equals("scissors") && computerChoice.equals("paper")){
            return "player";
        }
        else if(playerChoice.equals("scissors") && computerChoice.equals("rock")){
            return "computer";
        }
        
        return "tie";
    }
    
    
    // calculating stats
    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];
        
        // player stats
        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        double playerPercent = (playerWins * 100.0) / totalGames;
        stats[0][2] = String.valueOf(playerPercent) + "%";
        
        // computer stats
        stats[1][0]="Computer";
        stats[1][1] = String.valueOf(computerWins);
        double computerPercent = (computerWins*100.0)/totalGames;
        stats[1][2]=String.valueOf(computerPercent)+"%";
        
        return stats;
    }
    
    
    // displaying results
    public static void displayResults(String[] playerChoices, String[] computerChoices, String[] results, String[][] stats) {
        System.out.println("\nGame Results:");
        
        for(int i=0;i<playerChoices.length;i++){
            System.out.println("Game " + (i+1) + ": Player chose " + playerChoices[i] + ", Computer chose " + computerChoices[i] + " - Winner: " + results[i]);
        }
        
        System.out.println("\n\nWin Statistics:");
        System.out.println(stats[0][0] + " Wins: " + stats[0][1] + " - Winning Percentage: " + stats[0][2]);
        System.out.println(stats[1][0] + " Wins: " + stats[1][1] + " - Winning Percentage: " + stats[1][2]);
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of games to play:");
        int numGames = input.nextInt();
        
        String[] playerChoices = new String[numGames];
        String[] computerChoices = new String[numGames];
        String[] results = new String[numGames];
        
        int playerWins=0;
        int computerWins=0;
        
        // playing games
        for(int i=0;i<numGames;i++){
            System.out.println("\nGame " + (i+1));
            System.out.println("Enter your choice (rock/paper/scissors):");
            String playerChoice = input.next().toLowerCase();
            
            String computerChoice = getComputerChoice();
            
            playerChoices[i] = playerChoice;
            computerChoices[i]=computerChoice;
            
            String winner = findWinner(playerChoice,computerChoice);
            results[i] = winner;
            
            if(winner.equals("player")){
                playerWins++;
            }
            else if(winner.equals("computer")){
                computerWins++;
            }
        }
        
        // calculating stats
        String[][] stats = calculateStats(playerWins,computerWins,numGames);
        
        // displaying results
        displayResults(playerChoices,computerChoices,results,stats);
        
        input.close();
    }
    
}
