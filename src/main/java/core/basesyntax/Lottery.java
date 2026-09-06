package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    public Ball getRandomBall () {
        Random randomNumberSupplier = new Random();
        int number = randomNumberSupplier.nextInt(MAX_BALL_NUMBER);
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.number = number;
        ball.color = color;
        return ball;
    }
}
