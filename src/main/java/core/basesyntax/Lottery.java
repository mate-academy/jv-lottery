package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int value = new Random().nextInt(100);
        return new Ball(colorSupplier.getRandomColor(),value);

    }
}
