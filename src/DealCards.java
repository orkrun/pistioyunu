public class DealCards {
    public static String[] suits = Deck.suits;
    public static String[] ranks = Deck.ranks;
    public static String deck[] = Deck.deck;
    public static String[]playerCards =Deck.playerCards;
    public static String[]computerCards =Deck.computerCards;

    public void Start() {
        int m=0;
        int n=0;
        for (int i = 0; i < 8; i++) {
            if(i%2==0) {
                playerCards[m]=Deck.deck[i];
                System.out.println("player:" + playerCards[m]);
                m++;
            }
            else {
                computerCards[n]=Deck.deck[i];
                System.out.println("comp: " + computerCards[n]);
                n++;
            }
        }
    }
}