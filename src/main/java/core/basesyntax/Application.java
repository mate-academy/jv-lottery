package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        final int BALL_COUNT = 3;
        for (int i = 0; i < BALL_COUNT; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
