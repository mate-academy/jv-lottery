package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUNDARY_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(supplier.getRandomColor());
        randomBall.setNumber(random.nextInt(BOUNDARY_NUMBER));
        return randomBall;
    }
}
