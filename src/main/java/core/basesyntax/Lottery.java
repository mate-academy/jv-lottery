package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Ball BALL = new Ball();
    private static final int BOUND = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        BALL.setColor(colorSupplier.getRandomColor().name());
        BALL.setNumber(random.nextInt(BOUND));
        return BALL;
    }
}
