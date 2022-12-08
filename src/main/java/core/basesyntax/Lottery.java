package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Object getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ball.color = String.valueOf(ColorSupplier.getRandomColor());
        ball.number = random.nextInt(100);
        return ball;
    }
}
