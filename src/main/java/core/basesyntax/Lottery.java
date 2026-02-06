package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int MAX_POSSIBLE_NUMBER = 101;
    public Random index = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomNumber = this.index.nextInt(this.MAX_POSSIBLE_NUMBER);

        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(randomNumber);
        return ball;
    }
}
