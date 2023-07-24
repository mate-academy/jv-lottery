package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(String.valueOf(colorSupplier.getRandomColor()));
        int index = new Random().nextInt(NUMBER);
        ball.setNumber(index);
        return ball;
    }
}
