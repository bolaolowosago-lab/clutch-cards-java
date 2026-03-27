public class AI {
    public Card getPlay(Hand hand, CardPile pile) {
        for (int i = 0; i < hand.getSize(); i++) {
            Card c = hand.get(i);
            if (pile.canPlay(c)) {
                return c;
            }
        }
        return null;
    }

    public String toString() {
        return "Random Card AI";
    }
}