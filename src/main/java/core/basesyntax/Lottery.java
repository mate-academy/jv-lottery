package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private final int indexRandom = random.nextInt(100);

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), indexRandom);
    }
}
