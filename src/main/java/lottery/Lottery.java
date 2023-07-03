package lottery;

import core.basesyntax.Ball;
import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_BALL = 100;
    private ColorSupplier colorSupplier;
    private Random randomHelper;

    public Lottery() {
        colorSupplier = new ColorSupplier();
        randomHelper = new Random();
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), randomHelper.nextInt(MAX_NUMBER_BALL));
    }
}
