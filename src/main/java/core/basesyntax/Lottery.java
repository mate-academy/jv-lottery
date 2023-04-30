package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    public Lottery() {
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSuplier = new ColorSupplier();
        ball.setColor(colorSuplier.getRandomColor());
        ball.setNumber(random.nextInt(MAX_NUMBER));
        return ball;
    }
}
