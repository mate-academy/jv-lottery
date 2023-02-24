package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final int randomInputTopBound = 101;
    private Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(random.nextInt(randomInputTopBound), colorSupplier.getRandomColor());
    }
}
