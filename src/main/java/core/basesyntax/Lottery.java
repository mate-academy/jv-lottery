package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_BOUND = 101;
    public static final Random random = new Random();
    public static final Ball ball = new Ball();
    public static final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_BOUND));
        return ball;
    }
}
