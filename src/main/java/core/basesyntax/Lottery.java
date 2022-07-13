package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int NUMBER_OF_BALLS = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random randomNumber = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), randomNumber.nextInt(NUMBER_OF_BALLS));
    }
}
