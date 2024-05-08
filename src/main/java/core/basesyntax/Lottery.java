package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier supplier = new ColorSupplier();
        ball.setColor(supplier.getRandomColor());
        Random random = new Random();
        ball.setNumber(random.nextInt(100));
        return ball.toString();
    };
}
