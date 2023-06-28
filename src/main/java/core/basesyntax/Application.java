package core.basesyntax;

public class Application {
    private static final int BALL_NUMBER = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[BALL_NUMBER];
        for (int i = 0; i < BALL_NUMBER; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
