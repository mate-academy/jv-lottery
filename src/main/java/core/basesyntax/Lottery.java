package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int UPPER_BOUND = 100;
    private ColorSupplier getcolor = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(getcolor.getRandomColor());
        ball.setNumber(random.nextInt(UPPER_BOUND));
        return ball;
    }
}
