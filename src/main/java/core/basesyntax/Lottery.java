package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_POSSIBLE_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        String ballColor = color.getRandomColor();
        int ballNumber = random.nextInt(MAXIMUM_POSSIBLE_NUMBER) +1;
        return new Ball(ballColor, ballNumber);
    }
}
