package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static Random random = new Random();
    private static int maximumPossibleNumber = 100;

    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(maximumPossibleNumber));
        return ball;
    }
}
