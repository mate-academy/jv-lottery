package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUM = 100;
    private ColorSupplier getcolor = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(getcolor.getRandomColor());
        ball.setNumber(random.nextInt(NUM));
        return ball;
    }
}
