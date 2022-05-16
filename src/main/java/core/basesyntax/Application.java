package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int STEPS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery(new Random(), new ColorSupplier(new Random()));
        for (int i = 0; i < STEPS; i++) {
            System.out.println(lottery.getRandomBall().toString());

        }
    }
}
