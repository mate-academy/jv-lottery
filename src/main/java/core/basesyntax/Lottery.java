package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random randomizer = new Random();
    public static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        return new Ball(randomizer.nextInt(MAX_NUMBER + 1), supplier.getRandomColor(randomizer));
    }
}
