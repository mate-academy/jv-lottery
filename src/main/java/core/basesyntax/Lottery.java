package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        ColorSupplier randomColor = new ColorSupplier();
        ball.setColor(randomColor.getRandomColor());
        ball.setNumber(random.nextInt(101));
        return ball;
    }
}
