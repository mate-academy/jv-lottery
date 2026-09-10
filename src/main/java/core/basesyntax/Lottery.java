package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 101;
    private Random randomNumberSupplier = new Random();

    public Ball getRandomBall() {
        int number = randomNumberSupplier.nextInt(MAX_BALL_NUMBER);
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.setNumber(number);
        ball.setColor(color);
        return ball;
    }
}
