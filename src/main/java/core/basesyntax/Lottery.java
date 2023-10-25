package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int maxNumber = 100;

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(maxNumber);
        return new Ball(randomColor, randomNumber);
    }
}
