package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball newBall = new Ball(colorSupplier.getRandomColor(), new Random().nextInt(100));
        return newBall;
    }
}
