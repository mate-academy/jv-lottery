package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int RANDOM_VALUE = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor().toString();

        Random random = new Random();
        int randomValue = random.nextInt(RANDOM_VALUE);

        return new Ball(randomValue, randomColor);
    }
}
