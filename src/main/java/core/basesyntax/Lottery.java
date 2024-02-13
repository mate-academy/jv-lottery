package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int maxNumber = 100;
        int number = random.nextInt(maxNumber + 1);
        String color = colorSupplier.getRandomColor();

        return new Ball(color, number);
    }
}
