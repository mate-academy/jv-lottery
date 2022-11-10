package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_COUNT = 100;
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(RANDOM_COUNT);
        return new Ball(randomNumber,randomColor.getRandomColor());
    }
}
