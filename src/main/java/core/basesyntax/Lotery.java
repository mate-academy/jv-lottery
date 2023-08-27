package core.basesyntax;

import java.util.Random;

public class Lotery {
    private static final int numberBound = 101;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(numberBound));
    }
}
