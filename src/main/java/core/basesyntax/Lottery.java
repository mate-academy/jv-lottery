package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int randomMax = 100;
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static Random random = new Random();

    public String getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(randomMax));
        return ball.toString();
    }
}
