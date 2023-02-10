package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier(random);
        Lottery lottery = new Lottery(random, supplier);
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
