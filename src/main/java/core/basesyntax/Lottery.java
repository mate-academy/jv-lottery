package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALLS_NUMBER = 10;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(BALLS_NUMBER);
        supplier.getRandomColor();
        Ball ball = new Ball();
        ball.setNumber(randomNumber);
        ball.setColor(supplier.getRandomColor().name());
        return ball;
    }
}
