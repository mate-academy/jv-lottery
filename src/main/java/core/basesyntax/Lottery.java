package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int maxLimit = 100;

    public String getRandomBall() {
        int number = random.nextInt(maxLimit);
        Ball ball = new Ball(colorSupplier.getRandomColor(), number);
        return ball.toString();
    }
}
