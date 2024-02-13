package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Colors randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(100);
        return new Ball(randomColor, randomNumber);
    }
}
