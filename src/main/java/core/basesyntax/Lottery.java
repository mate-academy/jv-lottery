package core.basesyntax;

import java.util.Random;

public class Lottery {

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        Random random = new Random();
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
