package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball(new Random().nextInt(100), new ColorSupplier().getRandomColor());
        return ball;
    }
}
