package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE_OF_NUMBERS = 100;
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();


    public Ball getRandomBall() {
        String randomColor = color.getRandomColor();
        int randomNumber = random.nextInt(RANGE_OF_NUMBERS);
        return new Ball(randomColor, randomNumber);
    }
}
