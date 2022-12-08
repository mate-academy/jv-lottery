package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.color = supplier.getRandomColor();
        randomBall.number = random.nextInt(100);
        return randomBall;
    }
}
