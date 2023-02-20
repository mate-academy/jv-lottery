package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();

        ball.setNumber(new Random().nextInt(100));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
