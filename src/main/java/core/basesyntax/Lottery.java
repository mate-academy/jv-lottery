package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;

    public Lottery() {
        this.random = new Random();
    }
    public Ball getRandomBall() {
        int randomNumber = random.nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        Colors color = colorSupplier.getRandomColor();
        return new Ball(color, randomNumber);
    }
}
