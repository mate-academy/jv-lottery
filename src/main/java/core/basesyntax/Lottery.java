package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random random = new Random();

    public static String getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier color = new ColorSupplier();
        ball.setColor(color.getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball.toString();
    }
}
