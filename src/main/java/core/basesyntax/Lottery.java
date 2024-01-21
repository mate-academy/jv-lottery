package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_ON_BALL = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_NUMBER_ON_BALL);
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
