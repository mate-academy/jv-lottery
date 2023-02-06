package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private static final Random RANDOM = new Random();

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(),
                RANDOM.nextInt(MAX_NUMBER + 1));
    }
}
