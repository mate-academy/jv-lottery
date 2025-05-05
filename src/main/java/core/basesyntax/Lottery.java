package core.basesyntax;

import core.basesyntax.model.Ball;
import core.basesyntax.util.ColorSupplier;
import java.util.Random;

public class Lottery {
    private static final int MIN_NUM_BALL = 1;
    private static final int MAX_NUM_BALL = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int numberBall = random.nextInt(MIN_NUM_BALL, MAX_NUM_BALL);
        String colorBall = colorSupplier.getRandomColor();
        return new Ball(numberBall, colorBall);
    }
}
