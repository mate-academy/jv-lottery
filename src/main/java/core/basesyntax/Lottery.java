package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        int value = random.nextInt(100);
        return new Ball(supplier.getRandomColor(), value);
    }
}
