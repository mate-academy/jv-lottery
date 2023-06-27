package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random randomizer = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumberOfBall = randomizer.nextInt(100);
        Color randomColorOfBall = colorSupplier.getRandomColor();
        return new Ball(randomColorOfBall, randomNumberOfBall);
    }
}
