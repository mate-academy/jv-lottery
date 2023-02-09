package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE_OF_NUMBERS_ON_THE_BALL = 100;

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random randomNumber = new Random();
        return new Ball(colorSupplier.getRandomColor(),
                randomNumber.nextInt(RANGE_OF_NUMBERS_ON_THE_BALL));
    }
}
