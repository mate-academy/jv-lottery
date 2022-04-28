package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_POSSIBLE_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public String getRandomBall() {
        int number = random.nextInt(MAX_POSSIBLE_NUMBER);
        Ball ball = new Ball(colorSupplier.getRandomColor(), number);
        return ball.toString();
    }
}
