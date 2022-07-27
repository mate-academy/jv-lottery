package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        final int MAX_VALUE = 99;
        ColorSupplier color = new ColorSupplier();
        int number = new Random().nextInt(MAX_VALUE) + 1;
        Ball ball = new Ball(color.getRandomColor(), number);
        return ball;
    }
}
