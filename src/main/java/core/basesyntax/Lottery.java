package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int quantity = 100;
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(quantity),colorSupplier.getRandomColor().name());
    }
}
