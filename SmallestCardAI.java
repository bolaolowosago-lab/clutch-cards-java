public class SmallestCardAI extends AI {
    public Card getPlay(Hand hand, CardPile pile) {
        Card smallest = null;

        for (int i = 0; i < hand.getSize(); i++) {
            Card c = hand.get(i);
            if (pile.canPlay(c)) {
                if (smallest == null || c.getRankNum() < smallest.getRankNum()) {
                    smallest = c;
                }
            }
        }
        return smallest;
    }

    public String toString() {
        return "Smallest Card AI";
    }
}