package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int random = new Random().nextInt(100);

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random);
    }
}
