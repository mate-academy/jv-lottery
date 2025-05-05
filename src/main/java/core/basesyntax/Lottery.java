package core.basesyntax;

import core.basesyntax.model.Ball;
import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomNumber = new Random();

    public Ball getRandomBall() {
        String ballColor = colorSupplier.getRandomColor();
        int ballNumber = randomNumber.nextInt(MAX_BALL_NUMBER) + 1;
        return new Ball(ballColor, ballNumber);
    }
}
