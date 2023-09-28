package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    Ball ball = new Ball();
    ColorSupplier color = new ColorSupplier();
    public Ball getRandomBall() {
        ball.setNumber(random.nextInt(101));
        ball.setColor(color.getRandomColor());
        return ball;
    }
}
