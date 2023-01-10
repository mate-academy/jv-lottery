package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random randomNumber = new Random();
    private static final int value = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),randomNumber.nextInt(value));
    }
}
