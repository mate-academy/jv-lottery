package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random;
    private ColorSupplier colorSupplier;
    private final int maximumNumber = 100;
    private final int minimumNumber = 1;

    public Lottery() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(maximumNumber) + minimumNumber;
        return new Ball(color, number);
    }
}
