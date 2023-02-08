package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private final int number = random.nextInt(100);

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
