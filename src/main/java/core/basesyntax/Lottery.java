package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorsupplier = new ColorSupplier();
    private final Random random = new Random();
    public static final short MAX_NUMBER_BALLS = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorsupplier.getRandomColor().name());
        ball.setNumber(random.nextInt(MAX_NUMBER_BALLS));
        return ball;
    }
}
