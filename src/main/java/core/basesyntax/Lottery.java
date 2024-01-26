package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupply = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupply.getRandomColor(), random.nextInt(100));
    }
}
