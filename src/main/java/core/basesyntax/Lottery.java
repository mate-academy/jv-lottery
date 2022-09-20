package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(ColorSupplier.getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
