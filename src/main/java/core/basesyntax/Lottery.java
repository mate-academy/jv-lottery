package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random randNum = new Random(100);
    private static final int maxNumber = 100;

    public Ball getRandomBall() {
        Ball randBall = new Ball();
        randBall.setColor(supplier.getRandomColor());
        randBall.setNumber(randNum.nextInt(maxNumber));
        return randBall;
    }
}
