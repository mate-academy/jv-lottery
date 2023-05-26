package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.setColor(randomColor);
        ball.setNumber(random.nextInt(MAX_NUMBER));
        return ball;
    }
}
