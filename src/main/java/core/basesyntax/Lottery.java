package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final Random random = new Random();

    public Ball getRandomBall() {
        int randomValue = random.nextInt(100);
        return new Ball(ColorSupplier.getRandomColor(),randomValue);
    }
}
