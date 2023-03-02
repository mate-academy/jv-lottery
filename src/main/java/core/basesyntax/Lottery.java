package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRundomBall() {
        Ball ball = new Ball(new ColorSupplier().getRandomColor().toString(),
                new Random().nextInt(100));
        return ball;
    }
}
