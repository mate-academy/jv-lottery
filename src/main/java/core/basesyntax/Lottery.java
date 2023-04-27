package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomNumbers = new Random();
        return new Ball(colorSupplier.getRandomColor(), randomNumbers.nextInt(100));
    }
}
