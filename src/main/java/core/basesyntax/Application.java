package core.basesyntax;

public class Application {
    private static final Lottery lottery = new Lottery();

    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }

        for (Ball ball : balls) {
                System.out.println(ball);
        }
    }
}
