package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();
    private int value = Ball.MAX_NUMBER_BALL;

    public int getValue() {
        return value;
    }

    public Ball getRandomBall() {
        return new Ball(random.nextInt(getValue()), color.getRandomColor());
    }
}
