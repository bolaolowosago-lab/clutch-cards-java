import java.util.Random;

public class Deck {
    private Card[] cards;
    private int next;

    public Deck() {
        cards = new Card[52];
        int index = 0;

        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index++] = new Card(rank, suit);
            }
        }

        shuffle();
    }

    public void shuffle() {
        Random rand = new Random();

        for (int i = cards.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }

        next = 0;
    }

    public Card draw() {
        if (isEmpty()) {
            shuffle();
        }
        return cards[next++];
    }

    public int cardsRemaining() {
        return 52 - next;
    }

    public boolean isEmpty() {
        return next >= 52;
    }
}