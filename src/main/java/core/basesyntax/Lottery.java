package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();

    public Ball getRandomBall() {
        int magicNumber = random.nextInt(100);
        return new Ball(new ColorSupplier().getRandomColor(), magicNumber);
    }
}
