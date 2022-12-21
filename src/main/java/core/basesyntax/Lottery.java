package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOMBALL = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(RANDOMBALL);
        Ball ball = new Ball();
        ball.setNumber(randomNumber);
        ball.setColor(colorSupplier.getRandomColor().name());
        return ball;
    }
}

