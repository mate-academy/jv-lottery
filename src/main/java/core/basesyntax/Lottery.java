package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int POSSIBLE_NUMBER = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(POSSIBLE_NUMBER));
        return ball;
    }
}
