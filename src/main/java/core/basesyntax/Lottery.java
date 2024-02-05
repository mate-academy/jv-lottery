package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private final Random random = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int num = random.nextInt(BOUND);
        return new Ball(color, num);
    }
}
