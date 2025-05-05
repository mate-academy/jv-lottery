package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int FIGURE_COUNT = 100;
    private final ColorSupplier colorsSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        String randomColor = colorsSupplier.getRandomColor();
        int randomNumber = random.nextInt(FIGURE_COUNT);
        return new Ball(randomColor, randomNumber);
    }
}
