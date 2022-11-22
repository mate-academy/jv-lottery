package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static final int RANDOM_NUMBER_COUNT = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(RANDOM_NUMBER_COUNT));
        return ball;
    }
}
