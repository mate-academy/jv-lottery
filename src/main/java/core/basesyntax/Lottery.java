package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final int MAX_NUMBER = 101;
    private static final Random RANDOM_NUMBER = new Random();

    public Ball getRandomBall() {
        Colors randomColor = COLOR_SUPPLIER.getRandomColor();
        int randomBall = RANDOM_NUMBER.nextInt(MAX_NUMBER);
        return new Ball(randomColor, randomBall);
    }
}
