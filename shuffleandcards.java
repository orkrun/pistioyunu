import java.util.Random;

public class CardDeck {
  // Declare the suits and ranks
  private static final String[] SUITS = {"♠", "♣", "♥", "♦"};
  private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

  // Create an array to hold the cards
  private String[] deck;

  public CardDeck() {
    // Initialize the deck as an array of strings
    deck = new String[SUITS.length * RANKS.length];
    int index = 0;
    for (String suit : SUITS) {
      for (String rank : RANKS) {
        deck[index] = rank + suit;
        index++;
      }
    }
  }

  public void shuffle() {
    // Shuffle the deck using the Fisher-Yates  algorithm
    Random rand = new Random();
    for (int i = deck.length - 1; i > 0; i--) {
      int j = rand.nextInt(i + 1);
      String temp = deck[i];
      deck[i] = deck[j];
      deck[j] = temp;
    }
  }

  public static void main(String[] args) {
    CardDeck deck = new CardDeck();
    System.out.println(Arrays.toString(deck.deck)); // Output: [2♠, 3♠, ..., A♦]
    deck.shuffle();
    System.out.println(Arrays.toString(deck.deck)); // Output: [Q♣, 6♦, ..., 10♠]
  }
}