package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int FIGURE_COUNT = 100;
    private static Random random = new Random();

    public Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        int number = random.nextInt(FIGURE_COUNT) + 1;
        return new Ball(color, number);
    }
}
