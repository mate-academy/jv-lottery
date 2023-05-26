package core.basesyntax;

public class Application {
    private static final int BALLS_COUNT = 6;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] balls = new Ball[BALLS_COUNT];
        Lottery lottery = new Lottery();
        for (int i = 0; i < BALLS_COUNT; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
