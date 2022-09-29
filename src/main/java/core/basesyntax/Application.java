package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery[] someBalls = new Lottery[NUMBER_OF_BALLS];
        for (int i = 0; i < someBalls.length; i++) {
            someBalls[i] = new Lottery();
            System.out.println(someBalls[i].getRandomBall());
        }
        // create three balls using class Lottery and print information about them in console
    }
}
