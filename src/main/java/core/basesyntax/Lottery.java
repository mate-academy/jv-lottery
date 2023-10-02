package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_OF_BALL = new ColorSupplier();

    public Ball getRandomBall() {
        int randomInt = RANDOM.nextInt(101);
        return new Ball(COLOR_OF_BALL.getRandomColor(), randomInt);
    }
}
