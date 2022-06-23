package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAXIMUM_NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int randomNumber = random.nextInt(MAXIMUM_NUMBER);
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(randomNumber);
        return ball;
    }
}
