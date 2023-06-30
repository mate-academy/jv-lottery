package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random RANDOMIZER = new Random();
    private final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final int RANGE_OF_RANDOMIZER = 100;

    public Ball getRandomBall() {
        int randomNumberOfBall = RANDOMIZER.nextInt(RANGE_OF_RANDOMIZER);
        Color randomColorOfBall = COLOR_SUPPLIER.getRandomColor();
        return new Ball(randomColorOfBall, randomNumberOfBall);
    }
}
