package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier cs = new ColorSupplier();

        ball.setColor(cs.getRandomColor());
        ball.setNumber(new Random().nextInt(100));

        return ball;
    }
}
