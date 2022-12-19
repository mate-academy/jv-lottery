package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandomNumber() {

        int random = new Random().nextInt(100);
        return random;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(getRandomNumber());
        ball.setColor(colorSupplier.toString());
        return ball;
    }
}
