package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        String randomColor = ColorSupplier.getRandomColor();

        randomBall.setColor(randomColor);

        randomBall.setNumber(random.nextInt(100) + 1);

        return randomBall;
    }
}
