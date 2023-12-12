package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int LENGTH_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall(Ball ball) {
        ball.setColor(colorSupplier.getRandomColor());
        int randomNumber = random.nextInt(LENGTH_NUMBER);
        ball.setNumber(randomNumber);
        return ball;
    }
}
