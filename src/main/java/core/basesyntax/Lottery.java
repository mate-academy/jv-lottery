package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        Random random = new Random();
        Ball ball = new Ball(random.nextInt(100), color.getRandomColor());
        return ball;
    }
}
