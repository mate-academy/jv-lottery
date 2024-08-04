package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    ColorSupplier supplier = new ColorSupplier();
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        int number = random.nextInt(MAX_NUMBER);
        Color color = supplier.getRandomColor();
        return new Ball (color, number);
    }
}
