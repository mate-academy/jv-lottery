package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int COLOR_SUPPLIER = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {

        Ball ball = new Ball();
        ColorSupplier cs = new ColorSupplier();
        ball.setBall(random.nextInt(COLOR_SUPPLIER));
        ball.setColor(cs.getRandomColor());
        return ball;
    }
}

