package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final short MAX_NUMBER_BALLS = 100;
    private final ColorSupplier colorsupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorsupplier.getRandomColor().name());
        ball.setNumber(random.nextInt(MAX_NUMBER_BALLS));
        return ball;
    }
}
