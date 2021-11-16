package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    private static final int MAX_BALL_VALUE = new Random().nextInt(100);
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Lottery newBall = new Lottery();
        newBall.setColor(colorSupplier.getRandomColor().toString());
        newBall.setNumber(MAX_BALL_VALUE);
        return newBall;
    }
}
