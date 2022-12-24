package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private final Random random = new Random();
    private static final int amount = 100;

    public Ball getRandomBall() {
        int number = random.nextInt(amount);
        return new Ball(number, getRandomColor());
    }
}

