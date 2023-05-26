package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE = 100;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Color randomColor = supplier.getRandomColor();
        Ball ball = new Ball(randomColor.name(), random.nextInt(RANGE));
        return ball;
    }
}
