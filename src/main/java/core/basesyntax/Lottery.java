package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor().toString(), RANDOM.nextInt(100) + 1);
    }
}
