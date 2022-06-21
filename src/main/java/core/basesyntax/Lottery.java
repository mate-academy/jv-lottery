package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND_OF_NUMBERS = 100;
    private int randomNumberForBall = new Random().nextInt(BOUND_OF_NUMBERS);
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(randomNumberForBall, randomColor.getRandomColor());
    }
}