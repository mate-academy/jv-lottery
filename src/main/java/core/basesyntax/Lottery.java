package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Ball randomBall = new Ball();
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        randomBall.setColor(supplier.getRandomColor());
        randomBall.setNumber(random.nextInt(100));
        return randomBall;
    }
}
