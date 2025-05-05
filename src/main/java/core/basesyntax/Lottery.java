package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_NUMBER = 100;
    private static final int MINIMUM_NUMBER = 1;
    private Random random;
    private ColorSupplier colorSupplier;

    public Lottery() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = random.nextInt(MAXIMUM_NUMBER) + MINIMUM_NUMBER;
        return new Ball(color, number);
    }
}
