package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        final int maxRandomValue = 100;
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(random.nextInt(maxRandomValue), colorSupplier.getRandomColor());
    }
}
