package core.basesyntax;

import java.util.Random;

class Lottery {
    private static final int maxNumber = 100;

    private final Random random;

    public Lottery() {
        this.random = new Random();
    }

    public Ball getRandomBall() {
        ColorSupplier.Colors color = ColorSupplier.Colors.getRandomColor();
        int number = random.nextInt(maxNumber) + 1;
        return new Ball(color, number);
    }
}
