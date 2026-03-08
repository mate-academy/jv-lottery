package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER = 101;
    private Random rd = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), rd.nextInt(BALL_NUMBER));
    }
}
