package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
    Ball ball = new Ball();
    ball.color = new ColorSupplier().getRandomColor().name();
    ball.number = new Random().nextInt(100);
    return ball;
    }
}
