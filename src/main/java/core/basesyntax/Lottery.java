package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int maxNumber = 100;

    public Ball getRandomBall() {
        int number = random.nextInt(maxNumber);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
