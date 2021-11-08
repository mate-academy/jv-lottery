package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
    return new Ball(colorSupplier.getRandomColor(), new Random().nextInt(100));
    }
}

