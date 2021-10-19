package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_NUM = 100;

    public static Ball getRandomBall() {
        Random random = new Random();
        int randomNum = random.nextInt(MAX_NUM);
        return new Ball(randomNum, ColorSupplier.getRandomColor());
    }
}
