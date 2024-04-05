package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        Ball ball = new Ball();
        Random random = new Random();

        ball.setColor(randomColor.getRandomColor());
        ball.setNumber(random.nextInt(100));

        return ball;
    }
}
