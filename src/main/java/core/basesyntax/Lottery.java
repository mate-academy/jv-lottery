package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int maxNum = 101;
    private static final Random number = new Random();

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();

        return new Ball(color, number.nextInt(maxNum));
    }
}
