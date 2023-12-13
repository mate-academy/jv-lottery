package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int FIGURE_COUNT = 100;
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        int index = random.nextInt(FIGURE_COUNT) + 1;
        return new Ball(color.getRandomColor(), index);
    }
}
