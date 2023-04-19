package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor().toString());
        ball.setNumber(random.nextInt(MAX_NUMBER));
        return ball;
    }
}
