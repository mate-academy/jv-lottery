package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier;
    private Random random;

    public Lottery() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        final int index = random.nextInt(100);
        return new Ball(color, index);
    }
}
