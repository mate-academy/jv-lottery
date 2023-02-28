package core.basesyntax;

import java.util.Random;

public class Lottery {
    public final int COUNT_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(COUNT_NUMBER) + 1;
        return new Ball(color, number);
    }
}
