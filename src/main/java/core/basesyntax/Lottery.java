package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        String randomColor = colorSupplier.getRandomColor();
        int randNumbers = random.nextInt(MAX_RANDOM_NUMBER);
        ball.setColor(randomColor);
        ball.setNumber(randNumbers);
        return ball;
    }
}
