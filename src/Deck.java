import java.util.Random;

public class Deck {
    public static String[] suits = {"♠", "♣", "♥", "♦"};
    public static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    public static String[] deck = new String[suits.length * ranks.length];
    public static String[] playerCards = new String[4];
    public static String[] computerCards = new String[4];


    public void shuffleandcards() {
        // Initialize the deck as an array of strings
        deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + suit;
                index++;
            }
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }
}