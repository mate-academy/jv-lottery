package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        ball.setColor(ColorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
