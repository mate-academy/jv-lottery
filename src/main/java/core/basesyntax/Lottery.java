package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final ColorSupplier colorSupplier;
    private final int maxNumber;

    public Lottery(int maxNumber) {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
        this.maxNumber = maxNumber;
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(maxNumber);
        return new Ball(color, number);
    }
}
