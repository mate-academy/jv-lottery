package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBERS_MAX = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(NUMBERS_MAX));
        ball.setColor(new ColorSupplier().getRandomColor());
        return ball;
    }
}