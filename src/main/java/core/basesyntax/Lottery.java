package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 101;

    private final Random randomNumber = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(randomColor.getRandomColor(),randomNumber.nextInt(MAX_BALL_NUMBER));
    }
}
