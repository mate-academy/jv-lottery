package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final Ball BALL = new Ball();

    public Ball getRandomBall() {
        int numberOfBall = new Random().nextInt(100);
        BALL.setColor(COLOR_SUPPLIER.getRandomColor().name());
        BALL.setNumber(numberOfBall);
        return BALL;
    }
}
