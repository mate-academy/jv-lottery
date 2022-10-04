package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier cs = new ColorSupplier();
        Random random = new Random();

        ball.setBall(random.nextInt(99) + 1);
        ball.setColor(cs.getRandomColor());
        return ball;
    }
}

