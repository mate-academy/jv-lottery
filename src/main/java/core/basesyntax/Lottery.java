package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;

    private Random number = new Random();
    private ColorSupplier colour = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(number.nextInt(MAX_NUMBER), colour.getRandomColor());
    }
}
