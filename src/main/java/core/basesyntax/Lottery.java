package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor().toLowerCase(), new Random().nextInt(100));
    }
}
