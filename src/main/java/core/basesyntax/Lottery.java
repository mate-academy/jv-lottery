package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Object getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        ball.setColor(String.valueOf(ColorSupplier.getRandomColor()));
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
