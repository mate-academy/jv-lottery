package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        randomBall.setColor(colorSupplier.getRandomColor());
        randomBall.setNumber(random.nextInt(Application.MAX_NUMBER_OF_BALL));
        return randomBall;
    }
}
