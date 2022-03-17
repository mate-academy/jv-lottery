package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int bound = 100;

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(bound);
        return new Ball(color, number);
    }
}
