package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int BOUND = 100;

    public Ball getRandomBall() {

        ColorSupplier colorSupplier = new ColorSupplier();
        String colorStr = colorSupplier.getRandomColor();
        int number = new Random().nextInt(BOUND);
        return new Ball(colorStr, number);
    }
}
