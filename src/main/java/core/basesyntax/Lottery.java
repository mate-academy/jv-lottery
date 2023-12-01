package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_MAX = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public String getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(RANDOM_MAX));
        return ball.toString();
    }
}
