package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int maxValue = 100;

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int value = random.nextInt(maxValue);
        return new Ball(randomColor, value);
    }
}
