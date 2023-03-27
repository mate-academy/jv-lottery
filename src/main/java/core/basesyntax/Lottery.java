package core.basesyntax;

import java.util.Random;

class Lottery {
    private final Random random = new Random();

    private final int maximumNumber = 100;
    private final int minimumNumber = 1;

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Color color = supplier.getRandomColor();
        int number = random.nextInt(maximumNumber) + minimumNumber;
        return new Ball(color, number);
    }
}
