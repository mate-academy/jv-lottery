package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_FINAL = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        int randomNumber = random.nextInt(NUMBER_FINAL);
        ball.setNumber(randomNumber);
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
