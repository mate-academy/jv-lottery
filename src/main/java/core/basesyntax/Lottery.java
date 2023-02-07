package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_COUNT = 100;
    private Random random = new Random();
    private ColorSupplier getRandomColor = new ColorSupplier();

    public String getRandomBall() {
        int randomNumber = random.nextInt(NUMBER_COUNT);
        Ball ball = new Ball(getRandomColor.getRandomColor(), randomNumber);
        return ball.toString();
    }

}
