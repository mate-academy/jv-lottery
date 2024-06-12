package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int numberOfBalls = 3;
        Lottery lottery = new Lottery();
        for (int i = 0; i < numberOfBalls; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println("Ball " + (i + 1) + ": " + ball);
        }
    }
}