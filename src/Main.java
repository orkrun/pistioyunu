import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Deck deck = new Deck();
        DealCards dl = new DealCards();
        deck.shuffleandcards();
        System.out.println(Arrays.toString(deck.deck)); // Output: [2♠, 3♠, ..., A♦]
        deck.shuffle();
        System.out.println(Arrays.toString(deck.deck)); // Output: [Q♣, 6♦, ..., 10♠]
        //deck.show();
        dl.Start();
    }
}