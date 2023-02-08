package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier randomColor = new ColorSupplier();

        ball.setNumber(new Random().nextInt(100));
        ball.setColor(randomColor.getRandomColor());

        return ball;
    }
}
