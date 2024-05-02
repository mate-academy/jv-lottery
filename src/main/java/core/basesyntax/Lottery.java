package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_COUNT = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        int colorNumber = random.nextInt(BALL_COUNT);

        return new Ball(color, colorNumber);
    }
}
