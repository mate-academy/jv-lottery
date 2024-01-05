package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball(new Random().nextInt(100), randomColor.getRandomColor());
        return ball;
    }
}
