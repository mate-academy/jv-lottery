package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        DifferentColors randomIndex = supplier.getRandomIndex();
        Random random = new Random();
        int randomValue = random.nextInt(100);
        Ball ball = new Ball(randomIndex.name(), randomValue);
        return ball;
    }
}
