package core.basesyntax;

public class Application {
    private static final int AMOUNT_OF_BALLS = 3;
    private static final Lottery lottery = new Lottery();
    private static final Ball[] balls = new Ball[AMOUNT_OF_BALLS];

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i].name());
        }
    }
}
