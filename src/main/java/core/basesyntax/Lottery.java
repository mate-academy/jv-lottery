package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        final int number = 100;
        Ball ball = new Ball(new ColorSupplier().getRandomColor(), new Random().nextInt(number));
        return ball;
    }
}
