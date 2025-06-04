package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int numberOfRandomBall = new Random().nextInt(100);
        Colors color = colorSupplier.getRandomColor();
        return new Ball(color, numberOfRandomBall);
    }
}
