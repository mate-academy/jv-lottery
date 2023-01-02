package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        Ball ball1 = new Ball();
        ball1.setColor(supplier.getRandomColor());
        ball1.setNumber(random.nextInt(100));
        return ball1;
    }
}
