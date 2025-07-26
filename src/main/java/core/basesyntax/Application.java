package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int numBalls = 3;
        for (int i = 0; i < numBalls; i++) {
            Ball ball = Lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
