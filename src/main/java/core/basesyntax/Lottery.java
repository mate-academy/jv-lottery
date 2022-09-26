package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random randomizer = new Random();

    public Ball getRandomBall() {
        return new Ball(randomizer.nextInt(101), supplier.getRandomColor(randomizer));
    }
}
