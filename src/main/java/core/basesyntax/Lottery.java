package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        return new Ball(supplier.getRandomColor(), new Random().nextInt(100));
    }
}
