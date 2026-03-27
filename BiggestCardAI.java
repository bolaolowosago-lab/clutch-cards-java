public class BiggestCardAI extends AI {
    public Card getPlay(Hand hand, CardPile pile) {
        Card biggest = null;

        for (int i = 0; i < hand.getSize(); i++) {
            Card c = hand.get(i);
            if (pile.canPlay(c)) {
                if (biggest == null || c.getRankNum() > biggest.getRankNum()) {
                    biggest = c;
                }
            }
        }
        return biggest;
    }

    public String toString() {
        return "Biggest Card AI";
    }
}