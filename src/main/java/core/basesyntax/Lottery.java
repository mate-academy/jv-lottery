package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random index = new Random();
    private final int maximumPossibleNumber = 101;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomNumber = this.index.nextInt(maximumPossibleNumber);

        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(randomNumber);
        return ball;
    }
}
