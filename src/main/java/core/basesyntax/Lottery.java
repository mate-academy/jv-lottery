package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAXIMUM_POSSIBLE_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor().name(), MAXIMUM_POSSIBLE_NUMBER);
    }
}
