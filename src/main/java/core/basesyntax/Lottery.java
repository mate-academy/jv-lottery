package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        Color randomColor = supplier.getRandomColor();
        int sum = random.nextInt(MAX_NUMBER);
        ball.setColor(randomColor);
        ball.setNumber(sum);
        return ball;
    }
}
