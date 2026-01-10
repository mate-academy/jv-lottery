package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Ball ball;
    private final int range = 101;

    public Ball getRandomBall() {
        ball.setColor(new ColorSupplier().getRandomColor());
        ball.setNumber(new Random().nextInt(range));
        return ball;
    }
}
