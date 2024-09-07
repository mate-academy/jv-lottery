package core.basesyntax;

import java.util.Random;

public class Lottery {

    private Random random = new Random(100);
    private ColorSupplier colorSupplier = new ColorSupplier();

    public String getRandomBall() {
        Ball ball = new Ball();
        ball.setBall(colorSupplier.getRandomColor(), random.nextInt());
        return ball.toString();
    }
}
