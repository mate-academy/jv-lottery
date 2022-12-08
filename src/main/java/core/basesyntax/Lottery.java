package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        ball.number = random.nextInt(100);
        ball.color = new ColorSupplier().getRandomColor();
        return ball;
    }
}
