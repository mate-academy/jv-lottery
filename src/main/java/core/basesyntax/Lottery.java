package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int number = random.nextInt(100);
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}
