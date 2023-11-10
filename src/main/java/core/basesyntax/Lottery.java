package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomInt = random.nextInt(101);
        return new Ball(randomColor, randomInt);
    }
}
