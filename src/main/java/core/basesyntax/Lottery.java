package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Ball ball = new Ball(new Random().nextInt(100), new ColorSupplier().getRandomColor());

    public Ball getRandomBall() {
        return ball;
    }
}
