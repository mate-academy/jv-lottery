package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAX_BALL_RANDOM_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_BALL_RANDOM_NUMBER + 1);
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomNumber, randomColor);
    }
}
