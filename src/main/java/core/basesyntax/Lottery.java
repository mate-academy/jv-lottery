package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        Random randomNumber = new Random();
        ball.setNumber(randomNumber.nextInt(MAX_NUMBER));
        return ball;
    }
}
