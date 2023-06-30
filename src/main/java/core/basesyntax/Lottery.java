package core.basesyntax;

import java.util.Random;

class Lottery {
    private ColorSupplier colorSupplier;
    private final Random random;

    public Lottery() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(101);
        return new Ball(color, randomNumber);
    }
}

