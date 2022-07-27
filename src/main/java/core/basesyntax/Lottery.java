package core.basesyntax;

import java.util.Random;

/**
 * A lottery with multi-colored balls is held.
 */
public class Lottery extends ColorSupplier {
    private static final int MAX_NUMBER = 100;

    /**
     * Method creates a ball with a random color and a random number
     * (the maximum possible number is 100).
     * @return - new Ball
     */
    public Ball getRandomBall() {
        String ballColor = getRandomColor();
        int ballNamber = new Random().nextInt(MAX_NUMBER) + 1;
        return new Ball(Integer.toString(ballNamber), ballColor);
    }
}
