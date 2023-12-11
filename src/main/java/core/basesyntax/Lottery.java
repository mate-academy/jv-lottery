package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private final int lengthNumber = 100;

    public Ball getRandomBall(Ball ball) {
        ball.setColor(colorSupplier.getRandomColor());
        int randomNumber = random.nextInt(lengthNumber);
        ball.setNumber(randomNumber);
        return ball;
    }
}
