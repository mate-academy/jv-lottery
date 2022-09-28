package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        final ColorSupplier colorSupplier = new ColorSupplier();
        final int random = new Random().nextInt(100);
        return new Ball(colorSupplier.getRandomColor(), random);
    }
}
