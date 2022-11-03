package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final Random RANDOM = new Random();
    public static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    public static final int LIMIT = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(RANDOM.nextInt(LIMIT));
        ball.setColor(COLOR_SUPPLIER.getRandomColor());
        return ball;
    }
}
