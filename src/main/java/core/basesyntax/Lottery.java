package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private static Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(), random.nextInt(MAX_NUMBER));
    }
}
