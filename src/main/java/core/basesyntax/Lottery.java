package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static final int MAX_LOTTERY_NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, new Random().nextInt(MAX_LOTTERY_NUMBER) + 1);
    }
}
