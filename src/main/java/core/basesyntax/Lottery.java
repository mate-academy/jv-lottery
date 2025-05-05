package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE_OF_NUMBERS_ON_THE_BALL = 100;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random randomNumber = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),
                randomNumber.nextInt(RANGE_OF_NUMBERS_ON_THE_BALL));
    }
}
