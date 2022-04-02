package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomInt = new Random().nextInt(101);
        return new Ball(colorSupplier.getRandomColor(), randomInt);
    }
}
