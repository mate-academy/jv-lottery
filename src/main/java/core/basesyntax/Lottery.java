package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier cs = new ColorSupplier();
        Ball ball = new Ball(new Random().nextInt(100) + 1, cs.getRandomColor());
        return ball;
    }
}
