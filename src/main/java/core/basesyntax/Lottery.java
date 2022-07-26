package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        int number = new Random().nextInt(99) + 1;
        Ball ball = new Ball(color.getRandomColor(), number);
        return ball;
    }
}
