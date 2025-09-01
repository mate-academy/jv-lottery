package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random;
    private static final int MAX_BALL_NUMBER = 100;
    ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        int number = random.nextInt(MAX_BALL_NUMBER);
        Color color = colorSupplier.getRandomColor();
        Ball ball = new Ball(color, number);
        return ball;
    }
}
