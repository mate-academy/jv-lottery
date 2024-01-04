package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();
    int value = Ball.MAX_NUMBER_BALL;

    public Ball getRandomBall() {
        return new Ball(random.nextInt(value), color.getRandomColor());
    }
}
