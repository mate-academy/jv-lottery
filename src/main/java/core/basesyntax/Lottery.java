package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(supplier.getRandomColor());
        randomBall.setNumber(random.nextInt(100));
        return randomBall;
    }
}
