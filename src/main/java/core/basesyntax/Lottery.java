package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorsupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorsupplier.getRandomColor(), random.nextInt(Ball.MAX_NUMBER));
    }
}
