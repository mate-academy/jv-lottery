package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier color;
    private Random random;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(color.getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
