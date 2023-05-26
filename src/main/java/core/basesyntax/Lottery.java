package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;

    public String getRandomBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(MAX_NUMBER);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        Ball randomsBall = new Ball(randomColor, randomNumber);
        return String.valueOf(randomsBall);
    }
}
