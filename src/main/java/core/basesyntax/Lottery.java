package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random random = new Random();
    private static final int number = 100;

    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier color = new ColorSupplier();
        ball.setColor(color.getRandomColor());
        ball.setNumber(random.nextInt(number));
        return ball;
    }
}
