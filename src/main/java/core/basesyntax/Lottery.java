package core.basesyntax;

import java.util.Random;

public final class Lottery {
    private static final int MAXIMUM_POSSIBLE_NUMBER = 100;
    private final Ball randomBall = new Ball();
    private final String randomColor = new ColorSupplier().getRandomColor();
    private final Random random = new Random();
    private final int randomNumber = random.nextInt(MAXIMUM_POSSIBLE_NUMBER);

    public Ball getRandomBall() {
        randomBall.setColor(randomColor);
        randomBall.setNumber(randomNumber);
        return randomBall;
    }
}
