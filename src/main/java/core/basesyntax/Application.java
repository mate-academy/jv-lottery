package core.basesyntax;

import java.util.Random;

public class Application {
    /* number of showing random balls */
    public static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lot = new Lottery(new Random(), new ColorSupplier());
        // create three balls using class Lottery and print information about them in console
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            System.out.println(lot.getRandomBall());
        }
    }
}
