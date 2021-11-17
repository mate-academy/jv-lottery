package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_VALUE = 100;
    private final Random randomGenerationValue = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball newBall = new Ball();
        newBall.setColor(colorSupplier.getRandomColor().toString());
        newBall.setNumber(randomGenerationValue.nextInt(MAX_BALL_VALUE));
        return newBall;
    }
}
