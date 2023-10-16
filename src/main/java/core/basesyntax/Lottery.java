package core.basesyntax;

import java.util.Random;

class Lottery {
    private static final int COLOR_BOUND = 100;
    private ColorSupplier colorSupplier;
    private Random random;

    public Lottery() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(COLOR_BOUND) + 1;
        return new Ball(number, color);
    }
}

