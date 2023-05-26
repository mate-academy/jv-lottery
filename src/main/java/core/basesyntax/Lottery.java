package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colors = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colors.getRandomColor().toString());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
