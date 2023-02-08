package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Ball ball = new Ball();
    private final Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(101)); // random.nextInt() generate numbers in the range [x;x)

        return ball;
    }
}
