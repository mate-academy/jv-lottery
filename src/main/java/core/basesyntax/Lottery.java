package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int numberOfBall = new Random().nextInt(100);
        Ball ball = new Ball();
        ball.setColor(colorSupplier.toString());
        ball.setNumber(numberOfBall);
        return ball;
    }

}
