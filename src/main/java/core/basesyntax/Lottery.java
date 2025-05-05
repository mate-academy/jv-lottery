package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier;
    private Random random;
    private final int maxNumber = 100;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Ball getRandomBall() {
        int figureNumber = random.nextInt(maxNumber) + 1;
        return new Ball(colorSupplier.getRandomColor(), figureNumber);
    }
}
