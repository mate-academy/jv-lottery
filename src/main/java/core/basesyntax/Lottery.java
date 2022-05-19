package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;
    private final Random number;
    private final ColorSupplier colour;

    public Lottery(Random random, ColorSupplier color) {
        this.number = random;
        this.colour = color;
    }

    public Ball getRandomBall() {
        return new Ball(colour.getRandomColor(), number.nextInt(MAX_VALUE));
    }

}
