package core.basesyntax;

import java.util.Random;

public class Lottery {
    Ball ball = new Ball();

    public Ball getRandomBall() {
        ball.setColor(new ColorSupplier().getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
