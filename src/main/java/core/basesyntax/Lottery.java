package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int BOUND = 100;
    private Random random;
    private ColorSupplier colorSupplier;

    public Lottery() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(BOUND));
        return ball;
    }
}
