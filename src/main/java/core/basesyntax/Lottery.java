package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        Random random = null;
        int number = random.nextInt(MAX_RANDOM_NUMBER) + 1;

        return new Ball(color, number);
    }
}
