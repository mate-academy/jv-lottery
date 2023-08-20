package core.basesyntax;

public class Application {
    public static final int COUNT_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 1; i <= COUNT_OF_BALLS; i++) {
            System.out.println("Ball " + i + ": " + lottery.getRandomBall());
        }
    }
}
