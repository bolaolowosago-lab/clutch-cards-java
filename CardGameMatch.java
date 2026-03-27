public class CardGameMatch {
    private AI ai1;
    private AI ai2;

    public CardGameMatch(AI ai1, AI ai2) {
        this.ai1 = ai1;
        this.ai2 = ai2;
    }

    public boolean playGame() {
        int score1 = 0;
        int score2 = 0;
        boolean player1Turn = true;

        while (score1 < 10 && score2 < 10) {
            Deck deck = new Deck();
            Hand h1 = new Hand(deck, 5);
            Hand h2 = new Hand(deck, 5);
            CardPile pile = new CardPile();
            pile.start(deck);

            boolean roundOver = false;

            while (!roundOver) {
                if (player1Turn) {
                    Card play = ai1.getPlay(h1, pile);
                    if (play == null) {
                        score2++;
                        roundOver = true;
                    } else {
                        pile.play(play);
                        h1.remove(play);
                    }
                } else {
                    Card play = ai2.getPlay(h2, pile);
                    if (play == null) {
                        score1++;
                        roundOver = true;
                    } else {
                        pile.play(play);
                        h2.remove(play);
                    }
                }

                player1Turn = !player1Turn;
            }
        }

        return score1 > score2;
    }

    public double winRate(int nTrials) {
        int wins = 0;

        for (int i = 0; i < nTrials; i++) {
            if (playGame()) wins++;
        }

        return (double) wins / nTrials;
    }
}