package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public Lottery(Random rnd, ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.random = rnd;
    }

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_NUMBER) + 1;
        Color color = colorSupplier.getRandomColor();
        return new Ball(color, randomNumber);
    }
}
