package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(101);
        return new Ball(randomColor, randomNumber);
    }
}
