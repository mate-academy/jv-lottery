package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Color color;

    private int number = new Random().nextInt(MAX_VALUE);

    public Ball getRandomBall() {
        color = colorSupplier.getRandomColor();
        Ball ball = new Ball(color, number);
        return ball;
    }
}
