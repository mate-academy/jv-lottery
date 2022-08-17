package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static int MAX_BALL_VALUE = 100;
    private static ColorSupplier supplier = new ColorSupplier();
    private static Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), random.nextInt(MAX_BALL_VALUE));
    }
}
