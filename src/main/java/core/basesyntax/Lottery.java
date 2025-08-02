package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Colors newColor = supplier.getRandomColor();
        int number = new Random().nextInt(100);

        return new Ball(newColor, number);
    }
}
