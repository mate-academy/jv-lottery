package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_VALUE_OF_THE_BALL = 100;

    public static Ball getRandomBall() {
        Random random = new Random();
        return new Ball(new ColorSupplier().getRandomColor(),random.nextInt(MAX_VALUE_OF_THE_BALL));
    }
}
