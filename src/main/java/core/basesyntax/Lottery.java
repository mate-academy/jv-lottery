package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random randNum = new Random();

    public Ball getRandomBall() {
        Ball randBall = new Ball();
        randBall.setColor(supplier.getRandomColor());
        randBall.setNumber(randNum.nextInt(100));
        return randBall;
    }
}
