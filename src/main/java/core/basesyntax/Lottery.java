package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int maxBallNumber = 100;
        int number = random.nextInt(maxBallNumber);
        return new Ball(color, number);
    }
}
