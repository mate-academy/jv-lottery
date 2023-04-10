package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        final int maxNumber = 100;
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(maxNumber) + 1;
        return new Ball(color, number);
    }
}
