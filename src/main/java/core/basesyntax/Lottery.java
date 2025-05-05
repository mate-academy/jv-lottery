package core.basesyntax;

import java.util.Random;

class Lottery {
    private static final int FIGURE_COUNT = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(FIGURE_COUNT);
        return new Ball(color, number);
    }
}
