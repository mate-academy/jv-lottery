package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private Random random = new Random();

    public Ball getRandomBall() {

        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball(colorSupplier.getRandomColor(),random.nextInt(100));
        return ball;
    }
}
