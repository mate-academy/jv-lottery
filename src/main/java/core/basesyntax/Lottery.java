package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(100));
        return ball;
    }
}
