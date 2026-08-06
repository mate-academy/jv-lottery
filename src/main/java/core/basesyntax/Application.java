package core.basesyntax;

public class Application {

    private static final int numBall = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        Ball[] balls = new Ball[numBall];

        for (int i = 0; i < numBall; i++) {
            balls[i] = lottery.getRandomBall();
        }

        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
