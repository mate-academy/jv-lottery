package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupply = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupply.getRandomColor(), new Random().nextInt(100));
    }
}
