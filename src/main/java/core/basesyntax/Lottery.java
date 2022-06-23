package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        Random random = new Random();
        final int hundred = 100;
        int number = random.nextInt(hundred);
        ball.setNumber(number);
        return ball;
    }
}
