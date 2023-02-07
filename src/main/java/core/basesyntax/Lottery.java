package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    private static final int MAX_NUMBER = 100;
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(Color.valueOf(COLOR_SUPPLIER.getRandomColor()), RANDOM.nextInt(MAX_NUMBER));
    }
}
