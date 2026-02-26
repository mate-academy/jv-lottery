package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(100);
        String randomColor = colorSupplier.getRandomColor();

        return new Ball(randomNumber, randomColor);
    }
}
