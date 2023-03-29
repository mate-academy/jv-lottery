package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier;
    private final int maximumNumber = 100;
    private final int minimumNumber = 1;

    public Lottery() {
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(maximumNumber) + minimumNumber;
        return new Ball(color, number);
    }
}
