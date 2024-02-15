package core.basesyntax;

public class Application {
    private static final int BALL_AMOUNT = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery variant = new Lottery();
        for (int i = 0; i < BALL_AMOUNT; i++) {
            System.out.println(variant.getRandomBall());
        }
    }
}
