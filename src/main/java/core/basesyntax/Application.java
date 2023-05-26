package core.basesyntax;

public class Application {
    static final int NUMBER_OF_BALLS = 4;

    public static void main(String[] args) {
        final Lottery lottery = new Lottery();
        for (int i = 1; i < NUMBER_OF_BALLS; i++) {
            System.out.println("Ball " + i + ":" + lottery.getRandomBall());
        }
    }
}
