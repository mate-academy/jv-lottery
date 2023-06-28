package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier c = new ColorSupplier();
        ball.setColor(c.getRandomColor());
        Random r = new Random();
        ball.setNumber(r.nextInt(100));
        return ball;
    }
}
