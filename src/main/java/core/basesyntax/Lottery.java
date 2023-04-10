package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private int MAX_POSSIBLE = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(MAX_POSSIBLE));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
