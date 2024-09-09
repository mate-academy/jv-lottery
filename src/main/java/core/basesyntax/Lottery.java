package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int max = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(max);
        return new Ball(color, number);
    }
}
