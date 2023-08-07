package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        int number = random.nextInt(100);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
