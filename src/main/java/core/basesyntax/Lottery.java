package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUNDARY_RANDOM = 100;
    private final Random randomNumber = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int generatedNumber = randomNumber.nextInt(BOUNDARY_RANDOM);
        return new Ball(colorSupplier.getRandomColor(), generatedNumber);
    }
}
