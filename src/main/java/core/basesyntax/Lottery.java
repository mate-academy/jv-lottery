package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier color = new ColorSupplier();
        Random random = new Random();
        ball.number = random.nextInt(100);
        ball.color = color.getRandomColor();
        return ball;
    }
}
