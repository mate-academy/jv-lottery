package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int number = 100;
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(number));
        return ball;
    }
}
