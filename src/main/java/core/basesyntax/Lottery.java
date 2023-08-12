package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int BALL_NUMBER_RANDOM_BOUNDARY = 101;

    public Ball getRandomBall() {
        String randomColor = ColorSupplier.getRandomColor();
        int randomNumber = getRandomNumber();
        return new Ball(randomColor, randomNumber);
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(BALL_NUMBER_RANDOM_BOUNDARY);
    }
}
