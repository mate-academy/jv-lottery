package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_OF_VALUES = 100;
    private final Random random = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        Ball newBall = new Ball();
        newBall.setColor(randomColor.getRandomColor());
        newBall.setNumber(random.nextInt(NUMBER_OF_VALUES));
        return newBall;
    }
}
