package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        final int MAX_NUMBER = 100;
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int number = random.nextInt(MAX_NUMBER);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
