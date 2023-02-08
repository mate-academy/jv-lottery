package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BOUND = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int number = new Random().nextInt(BOUND);
        String colorStr = colorSupplier.getRandomColor();
        return new Ball(colorStr, number);
    }
}
