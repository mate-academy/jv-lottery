package core.basesyntax;

import java.util.Random;

public class Application {
    public static final int MAGIC_NUMBER = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery(random, colorSupplier);
        for (int i = 0; i < MAGIC_NUMBER; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
