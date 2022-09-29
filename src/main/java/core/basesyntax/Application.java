package core.basesyntax;

public class Application {
    private static final int BALLS_AMOUNT = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery[] balls = new Lottery[BALLS_AMOUNT];
        for (Lottery ball : balls) {
            ball = new Lottery();
            System.out.println(ball.getRandomBall());
        }
    }
}
