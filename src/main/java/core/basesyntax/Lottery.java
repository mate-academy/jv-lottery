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
        return new Ball(this.colorSupplier.getRandomColor(), this.random.nextInt(100));
    }
}
