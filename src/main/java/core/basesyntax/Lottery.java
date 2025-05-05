package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_VALUE = 100;

    public String getRandomBall() {
        Random random = new Random();
        int numberForRandBall = random.nextInt(MAX_VALUE);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, numberForRandBall).toString();
    }
}
