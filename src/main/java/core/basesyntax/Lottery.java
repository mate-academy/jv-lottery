package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball(colorSupplier.getRandomColor(),random.nextInt(100));
        return ball;
    }
}
