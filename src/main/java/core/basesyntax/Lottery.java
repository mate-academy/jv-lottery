package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        final int BOUND = 100;
        ColorSupplier colorSupplier = new ColorSupplier();
        String colorStr = colorSupplier.getRandomColor();
        int number = new Random().nextInt(BOUND);
        return new Ball(colorStr, number);
    }
}
