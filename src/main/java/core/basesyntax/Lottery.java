package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxNumber = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = String.valueOf(colorSupplier.getRandomColor());
        int randomNumber = new Random().nextInt(maxNumber) + 1;
        return new Ball(randomColor,randomNumber);
    }
}
