package core.basesyntax;

import java.util.Random;

public class Lottery {
    final private Random random = new Random();
    final private ColorSupplier colorSupplier = new ColorSupplier();
    final private int min =1;
    final private int max = 100;
    public Ball getRandomBall() {
        return new Ball(min + random.nextInt((max - min) + 1), colorSupplier.getRandomColor());
    }
}
