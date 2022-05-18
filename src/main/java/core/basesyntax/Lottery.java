package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), new Random().nextInt(100));
    }
}
