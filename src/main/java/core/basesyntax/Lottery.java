package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    ColorSupplier color = new ColorSupplier();
    private final static int BOUND = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(BOUND));
        ball.setColor(color.getRandomColor());
        return ball;
    }
}
