package core.basesyntax;

public class Application {
    private static final int COUNT = 3;
    private static final Lottery lottery = new Lottery();

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[COUNT];
        for (Ball ball : balls) {
            ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
