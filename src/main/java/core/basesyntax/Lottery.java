package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;
    private final Ball ball = new Ball();
    private final ColorSupplier newColor = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(BOUND);
        ball.setNumber(randomNumber);
        ball.setColor(newColor.getRandomColor());
        return ball;
    }
}
