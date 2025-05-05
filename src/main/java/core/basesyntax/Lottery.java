package core.basesyntax;

import java.util.Random;

public class Lottery {

    private ColorSupplier colorSupplier;
    private Random random;

    public Lottery() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(100));
    }
}
