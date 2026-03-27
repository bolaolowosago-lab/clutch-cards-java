public class Card {
    private int rank;
    private int suit;

    public Card(int rank, int suit) {
        if (rank < 1 || rank > 13 || suit < 1 || suit > 4) {
            System.out.println("Invalid card, defaulting to Ace of Spades");
            this.rank = 1;
            this.suit = 1;
        } else {
            this.rank = rank;
            this.suit = suit;
        }
    }

    public int getRankNum() {
        return rank;
    }

    public String getRankName() {
        String[] names = {"Ace","Two","Three","Four","Five","Six","Seven",
                          "Eight","Nine","Ten","Jack","Queen","King"};
        return names[rank - 1];
    }

    public String getSuitName() {
        String[] suits = {"Spades","Hearts","Clubs","Diamonds"};
        return suits[suit - 1];
    }

    public String toString() {
        return getRankName() + " of " + getSuitName();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Card)) return false;
        Card c = (Card) obj;
        return c.rank == rank && c.suit == suit;
    }
}