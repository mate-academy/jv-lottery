package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    ColorSupplier supplier = new ColorSupplier();
    private static final int BALLS_NUMBER = 10;
    public Ball getRandomBall() {
        int randomNumber = random.nextInt(BALLS_NUMBER);
        supplier.getRandomColor();
        Ball ball = new Ball();
        ball.setNumber(randomNumber);
        ball.setColor(supplier.getRandomColor().name());
        return ball;
    }
}
