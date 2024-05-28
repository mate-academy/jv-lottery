package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAGIC_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAGIC_NUMBER) + 1;
        return new Ball(color, number);
    }
}
