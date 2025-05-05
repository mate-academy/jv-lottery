package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BOUND = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();
        final int number = new Random().nextInt(BOUND);
        Ball ball = new Ball(color, number);
        return ball;
    }
}
