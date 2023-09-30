package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int randomInt = random.nextInt(100);

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), randomInt);
    }
}
