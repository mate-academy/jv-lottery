package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        ColorSupplier randColor = new ColorSupplier();
        ball.setColor(randColor.getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
