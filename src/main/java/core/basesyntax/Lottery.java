package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();

        Ball randomBall = new Ball();
        randomBall.setColor(supplier.getRandomColor());
        randomBall.setNumber(random.nextInt(MAX_RANDOM_NUMBER));

        return randomBall;
    }
}
