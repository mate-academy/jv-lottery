package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();

    public Ball getRandomBall() {
        Colors ballColor = colorSupplier.getRandomColor();
        int ballNumber = random.nextInt(100);
        return new Ball(ballColor,ballNumber);
    }
}
