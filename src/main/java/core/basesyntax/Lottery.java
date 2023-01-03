package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(new Random().nextInt(100));
        ball.setColor(new ColorSupplier().getRandomColor());
        return ball;
    }
}
