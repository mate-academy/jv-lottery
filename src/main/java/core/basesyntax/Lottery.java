package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int BOUND_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Random getRandom() {
        return random;
    }

    public Ball getRandomBall() {
        int number = getRandom().nextInt(BOUND_NUMBER);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
