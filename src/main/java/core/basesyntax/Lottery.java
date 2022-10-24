package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final Random RANDOM = new Random();
    private static final int BOUND_NUMBER = 100;

    public Ball getRandomBall() {
        int number = RANDOM.nextInt(BOUND_NUMBER);
        return new Ball(ColorSupplier.getRandomColor(), number);
    }
}

