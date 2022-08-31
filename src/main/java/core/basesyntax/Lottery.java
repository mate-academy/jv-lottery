package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier supplier = new ColorSupplier();
    private static final Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        String randomColor = supplier.getRandomColor();
        int number = new Random().nextInt(100);
        return new Ball(randomColor, number);
    }

}
