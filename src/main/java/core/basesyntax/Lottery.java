package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier supplier = new ColorSupplier();
        ball.setNumber(random.nextInt(100));
        ball.setColor(String.valueOf(supplier.getRandomColor()));
        return ball;
    }

}
