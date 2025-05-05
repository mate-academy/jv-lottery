package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ball.setColor(new ColorSupplier().getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
