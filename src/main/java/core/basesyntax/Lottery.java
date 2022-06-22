package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        Integer number = random.nextInt(MAX_NUMBER);
        ball.setNumber(number);
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
