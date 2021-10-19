package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_NUM = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        int randomNum = random.nextInt(MAX_NUM);
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(randomNum, colorSupplier.getRandomColor());
    }
}
