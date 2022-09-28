package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int FIGURE_COUNT = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random randomNumber = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), randomNumber.nextInt(FIGURE_COUNT));
    }
}
