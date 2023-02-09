package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final Random RANDOM = new Random();

    public Ball getRandomBall() {
        int randomBallNumber = RANDOM.nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(),randomBallNumber);
    }
}
