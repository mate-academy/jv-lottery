package core.basesyntax;

import core.basesyntax.model.Ball;
import core.basesyntax.util.ColorSupplier;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final int MIN_NUM_BALL = 1;
    private static final int MAX_NUM_BALL = 100;


    public static String getRandomBall() {
        return new Ball(random.nextInt(MIN_NUM_BALL, MAX_NUM_BALL),
                ColorSupplier.getRandomColor()).toString();
    }
}
