package core.basesyntax;

import java.util.Random;

public class Application {
    public static final Random random = new Random();
    public static final ColorSupplier colorSupplier = new ColorSupplier();
    public static final int maxLimit = 100;
    public static final int steps = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        for (int i = 0; i < steps; i++) {
            System.out.println(lottery.getRandomBall().toString());
        }
    }
}
