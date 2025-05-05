package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        Color randomColor = colorSupplier.getRandomColor();
        randomBall.setColor(randomColor.name());
        randomBall.setNumber(random.nextInt(MAX_RANDOM_NUMBER));
        return randomBall;
    }
}
