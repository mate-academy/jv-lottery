package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball(random.nextInt(101), new ColorSupplier().getRandomColor());
        return ball;
    }
}
