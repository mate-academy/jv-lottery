package core.basesyntax;

import java.util.Random;

public class Lotery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball ball = new Ball();
        ball.setNumber(new Random().nextInt(100));
        ball.setCollor(colorSupplier.getRandomColor());
        return ball;
    }
}
