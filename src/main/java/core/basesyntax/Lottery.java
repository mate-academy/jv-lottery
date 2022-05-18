package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random randomBall = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(randomBall.nextInt(100));
        return ball;
    }
}
