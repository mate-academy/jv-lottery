package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        final int max_number = 100;
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int number = random.nextInt(max_number);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
