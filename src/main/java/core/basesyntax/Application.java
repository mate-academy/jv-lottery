package core.basesyntax;

public class Application {
    private static final Lottery lottery = new Lottery();
    private static final int AMOUNT_OF_BALLS = 3;

    public static void main(String[] args) {
        for (int i = 1; i <= AMOUNT_OF_BALLS; i++) {
            System.out.println("Ball №" + i + ": " + lottery.getRandomBall());
        }
    }
}
