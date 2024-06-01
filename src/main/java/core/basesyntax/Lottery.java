package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int numberRandom = random.nextInt(101);
        return new Ball(colorSupplier.getRandomColor().name(), numberRandom);
    }
}
