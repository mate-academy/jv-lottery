package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final Random RANDOM = new Random();
    static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    static final Ball BALL = new Ball();
    static final int BOUND = 100;

    public Ball getRandomBall() {
        BALL.setColor(COLOR_SUPPLIER.getRandomColor().toString());
        BALL.setNumber(RANDOM.nextInt(BOUND));
        return BALL;
    }
}
