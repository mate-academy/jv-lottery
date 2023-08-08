package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUM = 100;

    public Ball getRandom() {
        return new Ball(new ColorSupplier().getRandomColor(),
                new Random().nextInt(MAX_BALL_NUM));
    }
}
