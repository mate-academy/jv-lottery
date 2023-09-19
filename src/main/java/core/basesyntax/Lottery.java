package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LIMIT_OF_NUMBERS = 101;
    private Random randomValuesSupplier = new Random();

    public Ball getRandomBall() {
        int randomInt = randomValuesSupplier.nextInt(LIMIT_OF_NUMBERS);
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), randomInt);
    }
}
