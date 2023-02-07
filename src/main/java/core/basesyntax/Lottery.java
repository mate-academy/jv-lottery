package core.basesyntax;

import java.util.Random;

public class Lottery {
    private int random = new Random().nextInt(100);
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Ball ball = new Ball(colorSupplier.getRandomColor(),random);

    public Ball getRandomBall() {
        return ball;
    }
}
