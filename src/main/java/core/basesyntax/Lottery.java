package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int MaxValue = 100;

    Lottery(int ball) {
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        final String randomColor = colorSupplier.getRandomColor().name();
        final int randomNumber = random.nextInt(MaxValue);
        ball.setColor(randomColor);
        ball.setNumber(randomNumber);
        return ball;
    }
}
