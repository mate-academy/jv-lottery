package core.basesyntax;

public class Application {
    public static final int NUMBER_OF_LOTTERIES = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Lottery[] lotteries = new Lottery[NUMBER_OF_LOTTERIES];

        for (int i = 0; i < NUMBER_OF_LOTTERIES; i++) {
            lotteries[i] = lottery;
            System.out.println(lotteries[i].getRandomBall());
        }
    }
}
