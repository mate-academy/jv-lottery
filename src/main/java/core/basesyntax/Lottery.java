package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_COUNT = 100;
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(NUMBER_COUNT));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
