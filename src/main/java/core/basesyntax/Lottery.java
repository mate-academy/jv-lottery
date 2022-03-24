package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random randomBall = new Random();
        return new Ball(colorSupplier.getRandomColor(), randomBall.nextInt(100));
    }
}
