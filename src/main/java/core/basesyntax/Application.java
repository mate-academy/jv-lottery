package core.basesyntax;

public class Application {
    private static final int BALL_NUMBERS = 3;

    public static void main(String[] args) {

        for (int i = 0; i < BALL_NUMBERS; i++) {
            Ball ball = Lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
