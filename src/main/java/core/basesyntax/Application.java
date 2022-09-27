package core.basesyntax;

public class Application {
    private static final int NUM = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball[] randomBall = new Ball[NUM];

        for (Ball ball : randomBall) {
            ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
