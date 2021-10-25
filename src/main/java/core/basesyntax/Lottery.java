package core.basesyntax;

import java.util.Random;

public class Lottery {

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball newBall = new Ball(colorSupplier.getRandomColor(), new Random().nextInt(100));
        return newBall;
    }
}
