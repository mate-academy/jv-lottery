package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().toString();
        int number = RANDOM.nextInt(100) + 1;
        return new Ball(color, number);
    }
}
