package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int randomInputTopBound = 101;
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        return new Ball(random.nextInt(randomInputTopBound), colorSupplier.getRandomColor());
    }
}
