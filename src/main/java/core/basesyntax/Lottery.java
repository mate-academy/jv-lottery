package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;
    private final Random random;
    private final int maxRandomNumber;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
        this.maxRandomNumber = 100;
    }

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(maxRandomNumber) + 1;
        return new Ball(randomColor, randomNumber);
    }
}

