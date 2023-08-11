package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random randomNumber = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {

        Ball randomBall = new Ball(colorSupplier.getRandomColor(), randomNumber.nextInt(100));
        return randomBall;
    }
}
