package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_MAX_NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier randColor = new ColorSupplier();
        Random rand = new Random();
        int randNumber = (rand.nextInt(BALL_MAX_NUMBER) + 1);
        return new Ball(randColor.getRandomColor(), randNumber);
    }
}
