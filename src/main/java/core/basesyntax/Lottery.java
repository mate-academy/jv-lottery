package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public static Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int value = random.nextInt(100);
        return new Ball(randomColor, value);
    }
}
