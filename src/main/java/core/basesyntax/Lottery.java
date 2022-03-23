package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int BOUND = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        return new Ball(ColorSupplier.getRandomColor(), random.nextInt(BOUND));
    }
}
