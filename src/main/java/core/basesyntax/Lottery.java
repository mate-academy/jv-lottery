package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Ball ball = new Ball();

    public Ball getRandomBall() {
        ball.setColor(new ColorSupplier().getRandomColor());
        ball.setNumber(new Random().nextInt(101));
        return ball;
    }
}
