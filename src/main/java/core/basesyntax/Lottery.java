package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    Ball ball = new Ball();
    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor().toString());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
