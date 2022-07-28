package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int maxValue = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int value = random.nextInt(maxValue);
        return new Ball(colorSupplier.getRandomColor(),value);

    }
}
