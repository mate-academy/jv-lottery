package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(100);

        return new Ball(color, randomNumber);
    }
}
