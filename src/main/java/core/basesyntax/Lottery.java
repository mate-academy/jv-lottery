package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier supplier = new ColorSupplier();
    private Ball ball = new Ball();
    private Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(100);
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(randomNumber);
        return ball;
    }
}
