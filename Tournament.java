public class Tournament {
    public static void main(String[] args) {
        AI random = new AI();
        AI small = new SmallestCardAI();
        AI big = new BiggestCardAI();

        AI[] ais = {random, small, big};

        for (int i = 0; i < ais.length; i++) {
            for (int j = 0; j < ais.length; j++) {
                CardGameMatch match = new CardGameMatch(ais[i], ais[j]);
                double rate = match.winRate(1000);

                System.out.println(ais[i] + " vs " + ais[j] +
                        " winRate: " + rate);
            }
        }
    }
}