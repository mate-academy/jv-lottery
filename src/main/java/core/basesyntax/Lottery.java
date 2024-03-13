package core.basesyntax;

import java.util.Random;

public class Lottery {
    Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setNumber(random.nextInt(100));
        ball.setColor(colorSupplier.getRandomColor());

        return ball;
    }
}
