package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LIMIT_COUNT = 100;
    private Random random = new Random();
    public Ball getRandomBall() {
        Colors randomColor = new ColorSupplier().getRandomColor();
        int randomNumber = random.nextInt(LIMIT_COUNT);

        return new Ball(randomColor, randomNumber);
    }
}
