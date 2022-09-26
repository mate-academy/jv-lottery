package core.basesyntax;

import core.basesyntax.models.Ball;
import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
