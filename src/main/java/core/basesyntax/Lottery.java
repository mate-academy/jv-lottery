package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int max = 100;

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(max);
        return new Ball(color, number);
    }
}
