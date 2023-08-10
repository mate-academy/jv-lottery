package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplierOfColors = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(supplierOfColors.getRandomColor(), new Random().nextInt(100));
    }
}
