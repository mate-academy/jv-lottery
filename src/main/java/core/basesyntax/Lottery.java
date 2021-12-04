package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {

        Ball ball = new Ball();
        Random random = new Random();
        ball.setNumber(random.nextInt(100));
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
