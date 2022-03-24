package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(100);
        return new Ball(colorSupplier.getRandomColor(), value);
    }
}
