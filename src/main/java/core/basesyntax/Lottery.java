package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    private final Ball ball = new Ball(color.getRandomColor(), random.nextInt(numberOfNumbers));
    private static final int numberOfNumbers = 100;

    public Ball getRandomBall() {
        return ball;
    }

    public String info() {
        return getRandomBall().getColor() + "\n" + ball.toString(getRandomBall().getNumber());

    }
}
