package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int bound = 100;

    protected Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor().name(), random.nextInt(bound));
    }
}
