package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        int index = new Random().nextInt(100);
        Ball ball = new Ball();
        ball.setNumber(index);
        ball.setColor(supplier.getRandomColor());
        return ball;
    }
}
