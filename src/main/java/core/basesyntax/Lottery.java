package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), new Random().nextInt(101));
    }
}
