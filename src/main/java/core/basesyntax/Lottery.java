package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        String colorRandom = colorSupplier.getRandomColor();
        int number = random.nextInt(RANGE);
        ball.setColor(colorRandom);
        ball.setNumber(number);
        return ball;
    }
}
