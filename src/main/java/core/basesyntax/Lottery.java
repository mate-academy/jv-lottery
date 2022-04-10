package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random random = new Random();

    public static int getRandom() {
        return random.nextInt(101);
    }

    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(getRandom());
        ball.setColor(ColorSupplier.getRandomColor());
        return ball;
    }
}
