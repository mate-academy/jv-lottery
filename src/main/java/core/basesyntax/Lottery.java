package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAX_VALUE = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(new ColorSupplier().getRandomColor());
        ball.setNumber(new Random().nextInt(MAX_VALUE));
        return ball;
    }
}
