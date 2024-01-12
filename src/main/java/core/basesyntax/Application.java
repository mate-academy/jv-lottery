package core.basesyntax;

public class Application {
    public static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery[] bal = new Lottery[NUMBER_OF_BALLS];

        for (int i = 0; i < bal.length; i++) {
            bal[i] = new Lottery();
            System.out.println("Ball " + (i + 1) + ":" + bal[i].getRandomBall());
        }
    }
}
