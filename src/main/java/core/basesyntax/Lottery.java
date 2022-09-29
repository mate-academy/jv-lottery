package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomInt = new Random();
        return new Ball(colorSupplier.getRandomColor(), randomInt.nextInt(100));
    }
}
