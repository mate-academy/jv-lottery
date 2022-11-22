package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        randomBall.setColor(supplier.getRandomColor().name());
        randomBall.setNumber(random.nextInt(MAX_NUMBER));
        return randomBall;
    }
}
