package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random random = new Random();
        final int MAX_NUM = 100;
        int randomNum = random.nextInt(MAX_NUM);
        return new Ball(randomNum, ColorSupplier.getRandomColor());
    }
}
