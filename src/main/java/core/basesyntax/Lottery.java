package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();
        final int number = new Random().nextInt(100);
        Ball ball = new Ball(color, number);
        return ball;
    }
}
