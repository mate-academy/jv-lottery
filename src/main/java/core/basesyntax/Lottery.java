package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    protected ColorSupplier colorSupplier = new ColorSupplier();
    protected Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(BOUND));
    }
}
