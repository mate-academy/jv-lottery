package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static int Value = 100;
    private ColorSupplier colorSupplier;
    private Random random;

    public Lottery(ColorSupplier colorSupplier, Random random) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(Value));
    }
}
