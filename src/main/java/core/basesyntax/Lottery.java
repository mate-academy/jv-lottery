package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = new Random().nextInt(100);
        Ball ball = new Ball(index, colorSupplier.getRandomColor());
        return ball;
    }
}
