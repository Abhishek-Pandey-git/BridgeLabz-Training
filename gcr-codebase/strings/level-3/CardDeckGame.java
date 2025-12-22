import java.util.Scanner;

public class CardDeckGame {
    
    // initialize deck with cards
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for(int i=0; i<suits.length; i++) {
            for(int j = 0; j<ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        
        return deck;
    }
    
    // shuffle the deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        
        for(int i=0; i<n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            
            // swap current card with random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }
    
    // distribute cards to players
    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if(numCards * numPlayers > deck.length) {
            System.out.println("Not enough cards to distribute");
            return null;
        }
        
        String[][] players = new String[numPlayers][numCards];
        
        int cardIndex = 0;
        for(int i=0; i<numPlayers; i++) {
            for(int j=0; j<numCards; j++) {
                players[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }
        
        return players;
    }
    
    // print players and their cards
    public static void printPlayers(String[][] players) {
        for(int i = 0; i<players.length; i++) {
            System.out.println("\nPlayer " + (i+1) + " cards:");
            for(int j=0; j<players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                          "Jack", "Queen", "King", "Ace"};
        
        // initialize deck
        String[] deck = initializeDeck(suits, ranks);
        
        System.out.println("Card Deck Game");
        System.out.println("Total cards in deck: " + deck.length);
        
        // shuffle deck
        shuffleDeck(deck);
        System.out.println("Deck shuffled");
        
        System.out.print("\nEnter number of cards per player: ");
        int numCards = input.nextInt();
        
        System.out.print("Enter number of players: ");
        int numPlayers = input.nextInt();
        
        // distribute cards
        String[][] players = distributeCards(deck, numCards, numPlayers);
        
        if(players != null) {
            printPlayers(players);
        }
        
        input.close();
    }
}
