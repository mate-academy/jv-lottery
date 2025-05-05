package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random;
    private ColorSupplier colorSupplier;

    public Lottery(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(colorSupplier.getRandomColor());
        randomBall.setNumber(random.nextInt(randomBall.MAX_NUMBER));
        return randomBall;
    }
}
