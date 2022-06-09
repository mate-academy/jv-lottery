package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int COUNT = 100;
    private static Random random;

    public static Random getRandom() {
        return random;
    }

    public Ball getRandomBall() {
        random = new Random();
        int number = random.nextInt(COUNT);
        return new Ball(ColorSupplier.getRandomColor(),number);
    }
}
