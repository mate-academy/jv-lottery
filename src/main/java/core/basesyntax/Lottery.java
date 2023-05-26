package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_RANGE = 100;
    private Random random;
    private ColorSupplier color;

    public Lottery() {
        this.random = new Random();
        this.color = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(NUMBER_OF_RANGE));
        ball.setColor(color.getRandomColor());
        return ball;
    }
}
