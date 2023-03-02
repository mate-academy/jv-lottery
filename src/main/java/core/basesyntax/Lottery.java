package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_RANDOM_NUM = 100;

    public static Ball getRandomBall() {
        int randomNum = new Random().nextInt(MAX_RANDOM_NUM);
        return new Ball(ColorSupplier.getRandomColor(), randomNum);
    }
}
