package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int QUANTITY = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private Ball ball = new Ball(random.nextInt(), colorSupplier.toString());

    public Ball getRandomBall() {
        return new Ball(random.nextInt(QUANTITY), colorSupplier.getRandomColor().name());
    }
}
