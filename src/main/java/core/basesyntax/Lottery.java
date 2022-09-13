package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int bound = 100;
    private Color color = new ColorSupplier().getRandomColor();
    private int number = new Random().nextInt(getBound());

    public int getBound() {
        return bound;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball(color, number);
        return ball;
    }
}
