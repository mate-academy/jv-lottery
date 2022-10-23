package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static ColorSupplier color = new ColorSupplier();
    private static Random number = new Random();
    private static final int RANGE_OF_NUMBERS = 100;

    public Ball getRandomBall() {
        String randomColor = color.getRandomColor();
        int randomNumber = number.nextInt(RANGE_OF_NUMBERS);
        return new Ball(randomColor, randomNumber);
    }
}
