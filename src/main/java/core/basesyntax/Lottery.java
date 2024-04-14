package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random;
    private ColorSupplier colorSupplier;

    public Lottery() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier(this.random);
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(101));
    }
}
