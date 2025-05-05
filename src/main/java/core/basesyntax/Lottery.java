package core.basesyntax;

import java.util.Random;

public class Lottery {
    Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(new ColorSupplier().getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
