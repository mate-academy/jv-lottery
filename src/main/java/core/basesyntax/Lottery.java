package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_BALL = 101;
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(random.nextInt(MAX_NUMBER_BALL), color.getRandomColor());
    }

}
