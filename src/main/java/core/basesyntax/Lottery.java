package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int value = random.nextInt(100) + 1;
        return new Ball(colorSupplier.getRandomColor(), value);
    }
}
