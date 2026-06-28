package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        final int maxNumber = 100;
        int number = random.nextInt(maxNumber);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
