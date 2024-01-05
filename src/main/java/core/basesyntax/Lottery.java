package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        Ball ball = new Ball(new Random().nextInt(100), randomColor.getRandomColor());
        return ball;
    }
}
