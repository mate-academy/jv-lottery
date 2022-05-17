package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int STEPS = 3;

    public static void main(String[] args) {
        Random random = new Random();
        Lottery lottery = new Lottery(random, new ColorSupplier(random));
        for (int i = 0; i < STEPS; i++) {
            System.out.println(lottery.getRandomBall().toString());
        }
    }
}
