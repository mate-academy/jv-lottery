package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier randomColor = new ColorSupplier();
        ball.setColor(randomColor.getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
