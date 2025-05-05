package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE_OF_RANDOMIZER = 100;
    private final Random randomizer = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumberOfBall = randomizer.nextInt(RANGE_OF_RANDOMIZER);
        Color randomColorOfBall = colorSupplier.getRandomColor();
        return new Ball(randomColorOfBall, randomNumberOfBall);
    }
}
