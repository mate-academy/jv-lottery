package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomBallNumber = random.nextInt(100) + 1;
        return new Ball(randomColor, randomBallNumber);
    }
}
