package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int numberOfBalls = 3;

        for (int i = 1; i <= numberOfBalls; i++) {
            Ball ball = Lottery.getRandomBall();
            System.out.println("Ball " + i + ": " + ball);
        }
    }
}