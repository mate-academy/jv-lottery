package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Ball ball = new Ball();
        int randomNumber = new Random().nextInt(100);
        ball.setColor(supplier.getRandomColor());
        ball.setNumber(randomNumber);
        return ball;
    }
}
