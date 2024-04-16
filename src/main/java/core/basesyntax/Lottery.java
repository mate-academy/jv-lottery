package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static ColorSupplier colorSupplier;

    private ColorSupplier getColorSupplier() {
        if (colorSupplier == null) {
            colorSupplier = new ColorSupplier();
        }
        return colorSupplier;
    }

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = String.valueOf(colorSupplier.getRandomColor());
        int randomNumber = random.nextInt(100);
        return new Ball(randomColor, randomNumber);
    }
}
