package core.basesyntax;

public class Application {
    private static final int BALLS_NUMBER = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        for (int i = 0; i < BALLS_NUMBER; i++) {
            System.out.println(new Lottery().getRandomBall());
        }
    }
}
