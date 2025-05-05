package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        final Random random = new Random();
        final ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery lottery = new Lottery(random, colorSupplier);
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
