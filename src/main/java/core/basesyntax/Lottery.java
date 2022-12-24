package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int amount = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        int number = random.nextInt(amount);
        return new Ball(number, getRandomColor());
    }
}

