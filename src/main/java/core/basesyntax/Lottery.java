package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        //Create variables for rand.nextInt(100) and colorSupplier.getRandomColor()
        int value = random.nextInt(MAX);
        String color = colorSupplier.getRandomColor();
        return new Ball(value, color);
    }
}
