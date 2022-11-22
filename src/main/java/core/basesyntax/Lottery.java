package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    ColorSupplier supplier = new ColorSupplier();
    Random random = new Random();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(supplier.getRandomColor().name());
        randomBall.setNumber(random.nextInt(MAX_NUMBER));
        return randomBall;
    }
}
