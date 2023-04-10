package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private int CONSTANT_CASE = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(CONSTANT_CASE));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
