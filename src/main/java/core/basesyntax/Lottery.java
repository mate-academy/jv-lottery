package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random random = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_NUMBER = 100;

    public static Ball getRandomBall() {
        int number = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
