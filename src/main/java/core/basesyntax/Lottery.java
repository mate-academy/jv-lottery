package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int rangeFrom = 1;
    private final int rangeTo = 101;

    public int getRandomNumber() {
        return random.nextInt(rangeFrom, rangeTo);
    }

    public Ball getRandomBall() {
        return new Ball(this.colorSupplier.getRandomColor(), this.getRandomNumber());
    }
}
