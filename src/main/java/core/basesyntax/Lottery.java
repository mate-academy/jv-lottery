package core.basesyntax;

import ball.characteristics.Ball;
import java.util.Random;

public class Lottery {
    private final int randomNum = new Random().nextInt(100);
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Ball ball = new Ball(randomNum, colorSupplier.getRandomColor());

    public Ball getRandomBall() {
        return ball;
    }
}
