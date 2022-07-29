package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int maxValue = 100;
    private ColorSupplier colorSupplier;
    private Random random;

    public Lottery() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(maxValue);
        return new Ball(color, number);
    }
}
