package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_OF_BALL = 100;
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final Ball BALL = new Ball();

    public Ball getRandomBall() {
        BALL.setColor(COLOR_SUPPLIER.getRandomColor().name());
        BALL.setNumber(new Random().nextInt(MAX_NUMBER_OF_BALL));
        return BALL;
    }
}
