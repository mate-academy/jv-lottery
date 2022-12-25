package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    public static final int LIMIT_NUMBER = 100;

    public Ball getRandomBall() {
        int NUMBER = random.nextInt(LIMIT_NUMBER);
        String color = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(NUMBER);
        return ball;
    }
}
