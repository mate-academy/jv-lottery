package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final Random RANDOM = new Random();
    public static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        int randomNumber = RANDOM.nextInt(MAX_NUMBER);
        String randomColor = COLOR_SUPPLIER.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
