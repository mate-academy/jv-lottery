package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int COUNT_NUMBER = 100;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(COUNT_NUMBER) + 1;
        return new Ball(color, number);
    }
}
