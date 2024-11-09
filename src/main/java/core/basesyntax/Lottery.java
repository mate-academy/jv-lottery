package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static int bound = 100;
    private ColorSupplier colorSupplier;
    Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(bound));
        return ball;
    }
}
