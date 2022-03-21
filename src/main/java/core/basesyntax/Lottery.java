package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random;

    public Lottery() {
        random = new Random();
    }

    public Ball getRandomBall() {
        int value = random.nextInt(100);
        ColorSupplier color = new ColorSupplier();
        Ball ball = new Ball(color.getRandomColor(), value);
        return ball;
    }
}
