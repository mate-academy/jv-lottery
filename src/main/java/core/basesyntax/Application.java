package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_USERS = 3;
    private static final Ball[] BALLS = new Ball[NUMBER_OF_USERS];

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        for (int i = 0; i < BALLS.length; i++) {
            BALLS[i] = new Lottery().getRandomBall();
            System.out.println(BALLS[i]);
        }
    }
}
