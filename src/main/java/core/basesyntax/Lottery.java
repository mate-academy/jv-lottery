package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BallLimit = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball anyBall = new Ball();
        anyBall.setColor(colorSupplier.getRandomColor().toString());
        anyBall.setNumber(random.nextInt(BallLimit));
        return anyBall;
    }
}
