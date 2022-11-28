package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(new Random().nextInt(101), colorSupplier.getRandomColor());
    }
}
