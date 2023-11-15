package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball randBall = new Ball();
        randBall.setColor(supplier.getRandomColor());
        randBall.setNumber(new Random().nextInt(100));
        return randBall;
    }
}
