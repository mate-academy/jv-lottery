package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxNumber = 100;
    private static final Random RANDOM = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = RANDOM.nextInt(maxNumber + 1);
        return new Ball(color, number);
    }
}
