package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BORDER_NUMBER = 100;
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(BORDER_NUMBER));
    }
}
