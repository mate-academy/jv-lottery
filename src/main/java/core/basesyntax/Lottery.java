package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Random number = new Random();
        ColorSupplier colour = new ColorSupplier();

        return new Ball(number.nextInt(MAX_NUMBER), colour.getRandomColor());
    }
}
