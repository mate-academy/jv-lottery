package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        ball.color = ColorSupplier.getRandomColor().toString();
        ball.number = random.nextInt(100);
        return ball;
    }
}
