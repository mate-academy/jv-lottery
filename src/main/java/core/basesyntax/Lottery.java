package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(String.valueOf(colorSupplier.getRandomColor()));
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
