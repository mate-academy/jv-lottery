package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(100);
        Ball ball = new Ball();
        ball.setNumber(value);

        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}

