package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int BALL_NUM_COUNT = 100;
    private static final Random random = new Random();

    public Ball getRandomBall() {
        String randomColor = getRandomColor();
        int randomNumber = random.nextInt(BALL_NUM_COUNT);
        return new Ball(randomColor, randomNumber);
    }
}
