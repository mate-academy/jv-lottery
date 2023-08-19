package core.basesyntax;

public class Application {
    public static final int countOfBalls = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 1; i <= countOfBalls; i++) {
            System.out.println("Ball " + i + ": " + lottery.getRandomBall());
        }
    }
}
