package core.basesyntax;

import java.util.Random;

public final class Lottery {
    private static final int MAXIMUM_POSSIBLE_NUMBER = 100;
    private final Random random = new Random();
    private final String randomColor = new ColorSupplier().getRandomColor();

    public Ball getRandomBall() {
        final Ball randomBall = new Ball();
        final int randomNumber = random.nextInt(MAXIMUM_POSSIBLE_NUMBER);
        randomBall.setColor(randomColor);
        randomBall.setNumber(randomNumber);
        return randomBall;
    }
}
