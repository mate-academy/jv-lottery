package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        ball.number = random.nextInt(101);
        ball.color = ColorSupplier.getRandomColor();
        return ball;
    }
}
