package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier cs = new ColorSupplier();

    public Ball getRundomBall() {
        Ball ball = new Ball();
        ball.setColor(cs.getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        System.out.println(ball);
        return ball;
    }
}
