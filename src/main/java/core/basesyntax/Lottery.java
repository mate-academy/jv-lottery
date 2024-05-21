package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(101);

        return new Ball(color, number);
    }
}
