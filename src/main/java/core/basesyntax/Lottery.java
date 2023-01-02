package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier ballColor = new ColorSupplier();
        Ball ball = new Ball();
        ball.color = ballColor.getRandomColor();
        ball.number = random.nextInt(100);
        return ball;
    }
}
