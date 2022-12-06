package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private int number = random.nextInt(100);

    public Ball getRandomBall() {
        Ball ball = new Ball(colorSupplier.getRandomColor().toString(), number);
        return ball;
    }
}
