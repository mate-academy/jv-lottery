package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int index = new Random().nextInt(100);
        Ball ball = new Ball();
        ball.setNumber(index);
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
