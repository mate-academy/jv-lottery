package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BOUND = 100;
    private Random randomVariables = new Random();
    private ColorSupplier colorVariables = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorVariables.getRandomColor(), randomVariables.nextInt(MAX_BOUND) + 1);
    }
}
