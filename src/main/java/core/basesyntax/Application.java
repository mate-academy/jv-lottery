package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        int numberOfBalls = 3;
        for (int i = 0; i < 3; i++) {
            Ball ball = Lottery.getRandomBall();
            System.out.println("Ball " + (i + 1) + ": " + ball);
        }
    }
}
