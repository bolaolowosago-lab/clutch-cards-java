public class CardPile {
    private Card top;

    public void start(Deck deck) {
        top = deck.draw();
    }

    public boolean canPlay(Card c) {
        if (c == null) return false;
        return c.getSuitName().equals(top.getSuitName()) ||
               c.getRankNum() > top.getRankNum();
    }

    public void play(Card c) {
        top = c;
    }

    public Card getTop() {
        return top;
    }
}