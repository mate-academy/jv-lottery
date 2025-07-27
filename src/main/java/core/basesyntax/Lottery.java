package core.basesyntax;

import java.util.Random;

public class Lottery {
    final private Random random = new Random();
    final private ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall(int min , int max) {
        return new Ball(min + random.nextInt(max), colorSupplier.getRandomColor());
    }
}
