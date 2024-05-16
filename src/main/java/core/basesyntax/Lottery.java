package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier colorSupplier;
    private final Random randomGenerator;

    public Lottery(ColorSupplier colorSupplier, Random randomGenerator) {
        this.colorSupplier = colorSupplier;
        this.randomGenerator = randomGenerator;
    }

    public Ball getRandomBall() {
        Color randomColor = ColorSupplier.getRandomColor();
        int randomNumber = randomGenerator.nextInt(MAX_NUMBER) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
