package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 3;

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Lottery lottery = new Lottery(random,colorSupplier);
        for (int i = MIN_RANGE; i < MAX_RANGE; i++) {
            System.out.println(lottery.getRandomBall().toString());
        }
    }
}
