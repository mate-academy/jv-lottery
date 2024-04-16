package core.basesyntax;

import java.util.Random;

public class Lottery {
    private int bound = 100;
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(color.getRandomColor());
        ball.setNumber(random.nextInt(bound + 1));
        return ball;
    }
}
