package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_MAX_NUMBER = 100;
    private Random rand = new Random();
    private ColorSupplier randColor = new ColorSupplier();

    public Ball getRandomBall() {
        int randNumber = (rand.nextInt(BALL_MAX_NUMBER) + 1);
        return new Ball(randColor.getRandomColor(), randNumber);
    }
}
