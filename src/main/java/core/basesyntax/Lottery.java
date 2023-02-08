package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int FIGURE_COUNT = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(FIGURE_COUNT);
        return new Ball(randomColor, randomNumber);
    }
}
