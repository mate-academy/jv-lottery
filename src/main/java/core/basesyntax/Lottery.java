package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_VALUE = 100;
    private final Random randomizer = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        int randomNumber = randomizer.nextInt(MAX_BALL_VALUE + 1);
        randomBall.setNumber(randomNumber);
        randomBall.setColor(colorSupplier.getRandomColor());

        return randomBall;
    }
}
