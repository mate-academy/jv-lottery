package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Ball ball = new Ball();
    private Random random = new Random();

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor().name());
        int index = random.nextInt(NUMBER);
        ball.setNumber(index);
        return ball;
    }
}
