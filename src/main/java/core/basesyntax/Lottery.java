package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int numberofBound = 100;
    private final Random numberRandom = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor().name(), numberRandom.nextInt(numberofBound));
    }
}
