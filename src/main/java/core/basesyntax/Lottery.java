package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int maxNumber = 100;

    public Ball getRandomBall() {
        int ballNumber = random.nextInt(maxNumber);
        String ballColor = colorSupplier.getRandomColor().name();
        return new Ball(ballColor, ballNumber);
    }
}
