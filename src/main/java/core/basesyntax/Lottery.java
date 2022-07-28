package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int number = new Random().nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), number);

    }

}
