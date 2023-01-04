package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random;
    private final ColorSupplier ballColor;

    public Lottery() {
        random = new Random();
        ballColor = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.color = ballColor.getRandomColor();
        ball.number = random.nextInt(100);
        return ball;
    }
}
