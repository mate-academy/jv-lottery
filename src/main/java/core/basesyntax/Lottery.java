package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int FIGURE_COUNT = 100;
    private ColorSupplier colorSupplier;

    private Random random = new Random();

    public Lottery() {
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(FIGURE_COUNT);
        return new Ball(randomColor, randomNumber);
    }
}
