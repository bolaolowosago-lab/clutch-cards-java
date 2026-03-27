public class Hand {
    private Card[] cards;
    private Deck deck;

    public Hand(Deck deck, int size) {
        this.deck = deck;
        cards = new Card[size];

        for (int i = 0; i < size; i++) {
            cards[i] = deck.draw();
        }
    }

    public int getSize() {
        return cards.length;
    }

    public Card get(int i) {
        if (i < 0 || i >= cards.length) {
            System.out.println("Index out of bounds");
            return cards[0];
        }
        return cards[i];
    }

    public boolean remove(Card card) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] != null && cards[i].equals(card)) {
                cards[i] = deck.draw();
                return true;
            }
        }
        return false;
    }
}