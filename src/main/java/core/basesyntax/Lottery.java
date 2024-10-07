package core.basesyntax;

import java.util.Random;

public class Lottery {
    Ball ball = new Ball();
    ColorSupplier colorSupplier = new ColorSupplier();
    Random rand = new Random();

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(rand.nextInt(100));
        return ball;
    }
}
