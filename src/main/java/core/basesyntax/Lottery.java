package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE = 100;

    public static Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        ball.setColor(ColorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(RANGE + 1));
        return ball;
    }
}
