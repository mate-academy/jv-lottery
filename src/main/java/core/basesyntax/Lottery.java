package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_NUMBER = 100;
    private Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        return new Ball(supplier.getRandomColor(), random.nextInt(MAX_NUMBER));
    }
}
