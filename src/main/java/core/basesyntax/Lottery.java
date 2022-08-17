package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BOUND = 100;

    public Ball getRandomBall() {
        Random randomVariables = new Random();
        ColorSupplier colorVariables = new ColorSupplier();
        return new Ball(colorVariables.getRandomColor(), randomVariables.nextInt(MAX_BOUND) + 1);
    }
}
