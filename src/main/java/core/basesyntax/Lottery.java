package core.basesyntax;

import java.util.Random;

class Lottery {
    private static final int MAX_NUMBER = 101;
    private ColorSupplier colorSupplier;
    private final Random random;

    public Lottery() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_NUMBER);
        return new Ball(color, randomNumber);
    }
}

