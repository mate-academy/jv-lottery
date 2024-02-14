package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        final int numberOfRandomBalls = 3;
        for (int i = 1; i <= numberOfRandomBalls; ++i) {
            System.out.println(i + " " + lottery.getRandomBall());
        }
    }
}
