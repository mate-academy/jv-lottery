package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int INDEX_BOUND = 100;

    public Ball getRandomBall() {
        int index = new Random().nextInt(INDEX_BOUND);
        Ball ball = new Ball();
        ball.setNumber(index);
        ball.setColor(new ColorSupplier().getRandomColor());
        return ball;
    }
}

