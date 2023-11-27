package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final Random RANDOM = new Random();
    private static final int MAX_RANDOM_NUMBER = 100;

    public static Ball getRandomBall() {
        String randomColor = COLOR_SUPPLIER.getRandomColor();
        int randomNumber = RANDOM.nextInt(MAX_RANDOM_NUMBER) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
