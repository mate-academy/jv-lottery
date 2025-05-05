package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        return new Ball(color, random.nextInt(MAX_VALUE));
    }
}
