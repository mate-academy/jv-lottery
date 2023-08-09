package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class Lottery {
    public static final Random RANDOM = new Random();
    private static final int MAX_BALL_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = RANDOM.nextInt(MAX_BALL_NUMBER);
        String ballColor = colorSupplier.getRandomColor().name().toLowerCase();
        return new Ball(ballNumber, ballColor);
    }
}
