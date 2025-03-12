package core.basesyntax;

import java.util.Random;

public class Lottery {

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {

        int randomValue = random.nextInt(100)+1;
        Ball ball = new Ball(colorSupplier.getRandomColor(), randomValue);
        return ball;
    }
}
