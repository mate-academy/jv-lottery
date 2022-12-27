package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();
    private static final int ballCount = 100;
    
    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(ballCount) + 1);
    }
}
