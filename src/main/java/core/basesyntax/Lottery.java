package core.basesyntax;

import java.util.Random;

public class Lottery {
    final int MAX_RANDOM_NUMBER = 100;
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    Ball ball = new Ball();

    public Ball getRandomBall() {
        int value = random.nextInt(MAX_RANDOM_NUMBER);
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(value);
        return ball;
    }
}
