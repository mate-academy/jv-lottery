package core.basesyntax;

import java.util.Random;

class Lottery {
    private final Random random = new Random();

    private final int MAX_NUMBER = 100;
    private final int MIN_NUMBER = 1;
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Color color = supplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER) + MIN_NUMBER;
        return new Ball(color, number);
    }
}