package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random index = new Random();
    private final int randomNumberBound = 101;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int randomNumber = this.index.nextInt(this.randomNumberBound);

        ball.setColor(this.colorSupplier.getRandomColor());
        ball.setNumber(randomNumber);
        return ball;
    }
}
