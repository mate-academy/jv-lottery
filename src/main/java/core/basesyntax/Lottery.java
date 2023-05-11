package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        int number = new Random().nextInt(101);
        return new Ball(supplier.getRandomColor(), number);
    }
}
