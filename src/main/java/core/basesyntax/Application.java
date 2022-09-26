package core.basesyntax;

public class Application {
    public static final int BALL_AMOUNT = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[BALL_AMOUNT];
        for (int i = 0; i < BALL_AMOUNT; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i].toString());
        }
    }
}
