package core.basesyntax;

public class Application {
    private static final Lottery lottery = new Lottery();
    private static final int numberOfRandomBalls = 3;

    public static void main(String[] args) {
        for (int i = 1; i <= numberOfRandomBalls; i++) {
            System.out.println(i + " " + lottery.getRandomBall());
        }
    }
}
