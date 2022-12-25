package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        final int NUMBER = random.nextInt(100);
        String color = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(NUMBER);
        return ball;
    }
}
