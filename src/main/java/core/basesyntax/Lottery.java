package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int randomNumber = new Random().nextInt(100);
        ball.setNumber(randomNumber);
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
